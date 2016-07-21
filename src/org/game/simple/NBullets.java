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
public class NBullets extends EnemyShot {
	private float vxNWay[];

	private float vyNWay[];

	private float theta;

	private int n;

	float vx1;

	float vy1;

	public NBullets(float x, float y, float vx0, float vy0, Battle ziki) {
		super(x, y);
		theta = 15F;
		n = 12;
		vxNWay = new float[n];
		vyNWay = new float[n];
		float rad_step = (float) (0.017453292519943295D * (double) theta);
		float rad = (float) (((double) (-n / 2) + 0.5D) * (double) rad_step);
		for (int i = 0; i < n;) {
			float c = (float) Math.cos(rad);
			float s = (float) Math.sin(rad);
			vxNWay[i] = vx0 * c - vy0 * s;
			vyNWay[i] = vx0 * s + vy0 * c;
			GamePanel.addList(new EnemyShot(x, y, vxNWay[i], vyNWay[i]));
			i++;
			rad += rad_step;
		}

		vx = vxNWay[0];
		vy = vyNWay[0];
	}

}
