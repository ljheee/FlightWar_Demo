package org.game.simple;

import java.awt.Image;
/**
 * 
 * Copyright 2008 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * @project org.game.simple
 * @author chenpeng  
 * @email£ºceponline@yahoo.com.cn 
 * @version 0.1
 */
abstract class Enemy extends Role {
	protected int tamaIntCount;

	protected Battle _battle;

	protected int power;

	protected int counter;

	protected int pattern;

	protected float vx;

	protected float vy;

	protected final int pattern0 = 0;

	protected final int pattern1 = 1;

	protected final int pattern2 = 2;

	protected final int pattern3 = 3;

	protected final int pattern4 = 4;

	protected final int pattern5 = 5;

	protected final int pattern6 = 6;

	protected final int pattern7 = 7;

	public Enemy(Battle battle, Image enemyImage) {
		super(enemyImage);
		this._battle = battle;
		tamaIntCount = 0;
		counter = 0;
	}

	public abstract void move();

	public void checkOutOfScreen() {
		if (y - 100F > (float) app.getHeight() || x + WIDTH + 100F < 0.0F
				|| x - 100F > (float) app.getWidth()
				|| y + HEIGHT + 100F < 0.0F)
			dead();
	}

	protected boolean checkHit(Role chara) {
		if ((chara instanceof BattleShot) && super.checkHit(chara)) {
			chara.dead();
			power--;
			if (power <= 0) {
				GamePanel.burst = new Burst(x, y);
				dead();
			}
			return true;
		} else {
			return false;
		}
	}

}
