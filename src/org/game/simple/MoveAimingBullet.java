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
public class MoveAimingBullet extends EnemyShot {
	
	public int t_loon_framework;
	
	private float x_ziki;

	private float y_ziki;

	private float x_enemy;

	private float y_enemy;

	private float distance;

	private float speed;

	public MoveAimingBullet(float x, float y, Battle ziki) {
		super(x, y);
		speed = 2.0F;
		x_ziki = ziki.x;
		y_ziki = ziki.y;
		x_enemy = x;
		y_enemy = y;
		//**//--///loonframewrkÃ·π©
		distance = (float) Math
				.sqrt((((double) x_ziki + (double) ziki.WIDTH / 2D) - (double) x_enemy)
						* (((double) x_ziki + (double) ziki.WIDTH / 2D) - (double) x_enemy)
						+ (double) ((y_ziki - y_enemy) * (y_ziki - y_enemy)));
		if (distance != 0.0F) {
			vx = (float) (((((double) x_ziki + (double) ziki.WIDTH / 2D) - (double) x_enemy) / (double) distance) * (double) speed);
			vy = ((y_ziki - y_enemy) / distance) * speed;
		} else {
			vx = 0.0F;
			vy = speed;
		}
	}

}
