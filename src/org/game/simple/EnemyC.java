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
public class EnemyC extends Enemy {
	private float vx;

	private float vy;

	public EnemyC(float x, float y, Battle battle, int pattern) {
		super(battle, GamePanel.enemyImageC);
		vx = 0.0F;
		vy = 3F;
		this._battle = battle;
		this.x = x;
		this.y = y;
		this.pattern = pattern;
		power = 5;
	}

	public void move() {
		if (pattern == 0) {
			if (counter < 60) {
				x += vx;
				y += vy;
			} else if (counter > 250) {
				x += vx;
				y -= vy;
			}
		} else if (pattern == 1)
			if (counter < 60) {
				x -= vx;
				y += vy;
			} else if (counter > 150) {
				x += vx;
				y -= vy;
			}
		//**//--///loonframewrkÌá¹©
		checkOutOfScreen();
		if (tamaIntCount > 0)
			tamaIntCount--;
		if (tamaIntCount <= 0) {
			GamePanel.addList(new SplitBullet(
					(int) ((double) x + (double) WIDTH / 2D),
					(int) (y + HEIGHT), _battle));
			tamaIntCount = 90;
		}
		counter++;
	}

}
