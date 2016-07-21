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
 * @email£∫ceponline@yahoo.com.cn 
 * @version 0.1
 */
public class EnemyA extends Enemy {

	public EnemyA(float x, float y, Battle battle, int pattern) {
		super(battle, GamePanel.enemyImageA);
		this._battle = battle;
		this.x = x;
		this.y = y;
		this.pattern = pattern;
		power = 1;
	}

	public void move() {
		if (pattern == 0) {
			if (counter < 100) {
				x++;
				y += 3D;
			} else if (counter > 200) {
				x--;
				y -= 3D;
			}
		} else if (pattern == 1) {
			if (counter < 100) {
				x--;
				y += 3D;
			} else if (counter > 100) {
				x++;
				y -= 3D;
				//**//--///loonframewrkÃ·π©
			}
		} else if (pattern == 2) {
			x += Math.sin((3.1415926535897931D * (double) counter) / 40D) * 5D;
			y += 1.5D;
		} else if (pattern == 3) {
			if (counter < 50)
				y += 2.5D;
			else if (counter >= 100) {
				x += Math
						.sin((3.1415926535897931D * ((double) counter - 100D)) / 160D) * 2.5D;
				y += Math
						.sin((3.1415926535897931D * ((double) counter - 20D)) / 160D) * 2.5D;
			}
		} else if (pattern == 4) {
			if (counter < 50)
				y += 2.5D;
			else if (counter >= 100) {
				x -= Math
						.sin((3.1415926535897931D * ((double) counter - 100D)) / 160D) * 2.5D;
				y += Math
						.sin((3.1415926535897931D * ((double) counter - 20D)) / 160D) * 2.5D;
			}
		} else if (pattern == 5) {
			if (counter < 100) {
				x += 3D;
				y -= 4D;
			} else if (counter >= 100) {
				x -= 3D;
				y += 4D;
			}
		} else if (pattern == 6)
			if (counter < 100) {
				x -= 3D;
				y -= 4D;
			} else if (counter >= 100) {
				x += 3D;
				y += 4D;
			}
		checkOutOfScreen();
		if (tamaIntCount > 0)
			tamaIntCount--;
		if (tamaIntCount <= 0) {
			GamePanel.addList(new MoveAimingBullet(x + WIDTH / 2.0F,
					y + HEIGHT, _battle));
			tamaIntCount = 25;
		}
		counter++;
	}
}
