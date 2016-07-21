package org.game.simple;

import java.awt.Color;
import java.awt.Graphics;
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
public class Battle extends Role {
	private static Battle battle = new Battle();

	private int tamaIntCount;

	private float speed;

	private float oldx;

	private float oldy;

	public static float vx;

	public static float vy;

	private float tv[] = { -1F, -7F, 0.0F, -8F, 1.0F, -7F };

	public int power;

	public int powerMax;

	public Battle() {
		super(GamePanel.heroImage);
		speed = 3F;
		tamaIntCount = 0;
		x = ((float) app.getWidth() - WIDTH) / 2.0F;
		y = (float) app.getHeight() - HEIGHT * 2.0F;
		power = 600;
		powerMax = power;
	}

	public static Battle getInstance() {
		return battle;
	}

	public void move() {
		oldx = x;
		oldy = y;
		if (Key.left) {
			if (Key.xkey)
				x -= (double) speed / 4D;
			else
				x -= speed;
			if (x <= 0.0F)
				x = 0.0F;
		}
		if (Key.right) {
			if (Key.xkey)
				x += (double) speed / 4D;
			else
				x += speed;
			if (x + WIDTH >= (float) app.getWidth())
				x = (float) app.getWidth() - WIDTH;
		}
		if (Key.down) {
			if (Key.xkey)
				y += (double) speed / 4D;
			else
				y += speed;
			if (y + HEIGHT >= (float) app.getHeight())
				y = (float) app.getHeight() - HEIGHT;
		}
		if (Key.up) {
			if (Key.xkey)
				y -= (double) speed / 4D;
			else
				y -= speed;
			if (y <= 0.0F)
				y = 0.0F;
		}
		//**//--///loonframewrkÌá¹©
		vx = x - oldx;
		vy = y - oldy;
		if (tamaIntCount > 0)
			tamaIntCount--;
		if (Key.zkey && tamaIntCount <= 0) {
			for (int i = 0; i < tv.length; i += 2) {
				GamePanel.addList(new BattleBasic(x + WIDTH / 2.0F, y, tv[i],
						tv[i + 1]));
				tamaIntCount = 8;
			}
		}
		if (Key.xkey && !Key.zkey && tamaIntCount <= 0) {
			GamePanel.addList(new BattleBeam(x + WIDTH / 2.0F, y, 0.0F, -8F));
			tamaIntCount = 2;
		}
	}

	public boolean checkHit(Role chara) {
		if ((chara instanceof EnemyA) || (chara instanceof EnemyB)
				|| (chara instanceof EnemyC) || (chara instanceof EnemyShot)) {
			if ((x + WIDTH) - 14F > chara.x && x + 14F < chara.x + chara.WIDTH
					&& (y + HEIGHT) - 12F > chara.y
					&& y + 12F < chara.y + chara.HEIGHT) {
				chara.dead();
				if (chara instanceof EnemyBeam)
					power--;
				power -= 50;
				if (power <= 0) {
					dead();
					GamePanel.burst = new Burst(x, y);
				}
				return true;
			}
		} else if ((chara instanceof Boss) && (x + WIDTH) - 14F > chara.x + 50F
				&& x + 14F < (chara.x + chara.WIDTH) - 50F
				&& (y + HEIGHT) - 12F > chara.y + 50F
				&& y + 12F < (chara.y + chara.HEIGHT) - 80F) {
			power--;
			if (power <= 0) {
				dead();
				GamePanel.burst = new Burst(x, y);
			}
			return true;
		}
		return false;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return WIDTH;
	}

	public float getHeight() {
		return HEIGHT;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public Image getImage() {
		return img;
	}

	public int getPower() {
		return power;
	}

	public int getPowerMax() {
		return powerMax;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void drawPower(Graphics g) {
		g.setColor(Color.white);
		g.drawRect(380, 450, 50, 15);
		g.setColor(Color.green);
		g.fillRect(381, 451,
				(int) ((50D / (double) (float) powerMax) * (double) power) - 1,
				14);
	}

}
