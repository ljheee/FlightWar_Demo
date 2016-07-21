package org.game.simple;
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
public class EnemyB extends Enemy {

	public EnemyB(float x, float y, Battle battle, int pattern) {
		super(battle, GamePanel.enemyImageB);
		this._battle = battle;
		this.x = x;
		this.y = y;
		vx = 0.0F;
		vy = 2.0F;
		this.pattern = pattern;
		power = 25;
	}

	public void move() {
		if (pattern == 0)
			if (counter < 100)
				y += vy;
			else if (counter > 300)
				y -= vy;
		checkOutOfScreen();
		if (tamaIntCount > 0)
			tamaIntCount--;
		if (counter > 100 && counter < 280 && tamaIntCount <= 0) {
			GamePanel.addList(new EnemyBeam(x + WIDTH / 2.0F, y + HEIGHT,
					_battle, this));
			tamaIntCount = 2;
		}
		counter++;
	}
}
