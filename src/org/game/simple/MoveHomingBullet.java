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
public class MoveHomingBullet extends EnemyShot {

	private float vx;

	private float vy;

	private float speed;

	private int count;

	float vx1;

	float vy1;

	private Battle ziki;

	public MoveHomingBullet(float x, float y, float vx, float vy, Battle ziki,
			Image img) {
		super(x, y, img);
		speed = 6F;
		count = 0;
		this.ziki = ziki;
		this.vx = vx;
		this.vy = vy;
	}

	public void move() {
		if (count > 0)
			count--;
		if (count <= 0) {
			float distance = (float) Math
					.sqrt((((double) ziki.x + (double) ziki.WIDTH / 2D) - (double) x)
							* (((double) ziki.x + (double) ziki.WIDTH / 2D) - (double) x)
							+ (double) ((ziki.y - y) * (ziki.y - y)));
			if (distance != 0.0F) {
				vx1 = (float) (((((double) ziki.x + (double) ziki.WIDTH / 2D) - (double) x) / (double) distance) * (double) speed);
				vy1 = ((ziki.y - y) / distance) * speed;
			} else {
				vx1 = 0.0F;
				vy1 = speed;
			}
			vx = (vx / (float) Math.sqrt(vx * vx + vy * vy)) * speed;
			vy = (vy / (float) Math.sqrt(vx * vx + vy * vy)) * speed;
			vx = (float) ((double) vx * 0.20000000000000001D + (double) vx1 * 0.80000000000000004D);
			vy = (float) ((double) vy * 0.20000000000000001D + (double) vy1 * 0.80000000000000004D);
			count = 50;
		}
		x += vx;
		y += vy;
		if (x + WIDTH < 0.0F || x > (float) app.getWidth() || y + HEIGHT < 0.0F
				|| y > (float) app.getHeight())
			dead();
	}

}
