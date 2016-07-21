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
 * @email£∫ceponline@yahoo.com.cn 
 * @version 0.1
 */
public class BossA extends Boss {

	public static float vx;

	public static float vy;

	public BossA(Battle battle) {
		super(battle, GamePanel.bossImageA);
		this._battle = battle;
		x = 50F;
		y = -250F;
		power = 1000;
		powerMax = power;
		vx = 1.0F;
		vy = 0.0F;
	}

	public void move() {
		if (counter < 150)
			y += 2D;
		else if (counter >= 150) {
			x += vx;
			if (x + WIDTH > (float) app.getWidth())
				vx = -vx;
			if (x < 0.0F)
				vx = -vx;
		}
		checkOutOfScreen();
		if (tamaIntCount > 0)
			tamaIntCount--;
		if (counter % 2000 < 500) {
			if (tamaIntCount <= 0 && counter % 2000 > 100) {
				GamePanel.addList(new MoveAimingBullet(
						(x + WIDTH / 2.0F) - 50F, y + HEIGHT, _battle));
				GamePanel.addList(new MoveAimingBullet(x + WIDTH / 2.0F + 50F,
						y + HEIGHT, _battle));
				GamePanel.addList(new MoveAimingBullet(x + WIDTH / 2.0F, y
						+ HEIGHT, _battle));
				//**//--///loonframewrkÃ·π©
				tamaIntCount = 30;
			}
		} else if (counter % 2000 < 1000) {
			if (tamaIntCount <= 0 && counter % 2000 > 600) {
				GamePanel.addList(new MoveHomingBullet(x + WIDTH / 2.0F, y
						+ HEIGHT, 2.0F, 2.0F, _battle,
						GamePanel.HomingBulletImage));
				GamePanel.addList(new MoveAimingBullet(x + WIDTH / 2.0F, y
						+ HEIGHT, _battle));
				tamaIntCount = 60;
			}
		} else if (counter % 2000 < 1500) {
			if (tamaIntCount <= 0 && counter % 2000 > 1100) {
				GamePanel.addList(new NBullets(x + WIDTH / 2.0F, y + HEIGHT,
						0.0F, 2.0F, _battle));
				GamePanel.addList(new MoveAimingBullet(x + WIDTH / 2.0F, y
						+ HEIGHT, _battle));
				tamaIntCount = 80;
			}
		} else if (counter % 2000 < 2000 && tamaIntCount <= 0
				&& counter % 2000 > 1600) {
			GamePanel.addList(new CircleBullets(x + WIDTH / 2.0F, y + HEIGHT,
					true));
			GamePanel.addList(new MoveAimingBullet(x + WIDTH / 2.0F,
					y + HEIGHT, _battle));
			tamaIntCount = 50;
		}
		counter++;
	}

	protected boolean checkHit(Role chara) {
		if ((chara instanceof BattleShot) && x - 20F > chara.x - WIDTH
				&& x + 20F < chara.x + chara.WIDTH
				&& y - 50F > chara.y - HEIGHT
				&& y + 50F < chara.y + chara.HEIGHT) {
			chara.dead();
			power--;
			if (power <= 0) {
				dead();
				GamePanel.largeBurst = new BigBurst(x, y);
			}
			return true;
		} else {
			return false;
		}
	}

	public Image getImage() {
		return img;
	}

}
