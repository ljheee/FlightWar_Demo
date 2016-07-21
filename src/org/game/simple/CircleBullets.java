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
public class CircleBullets extends EnemyShot {

	private float speed;

	private float vxCircle[];

	private float vyCircle[];

	private int tamaNum;

	public CircleBullets(float x, float y, boolean flag) {
		super(x, y);
		speed = 1.0F;
		tamaNum = 24;
		vxCircle = new float[tamaNum];
		vyCircle = new float[tamaNum];
		float rad_step = (float) (6.2831853071795862D / (double) tamaNum);
		float rad;
		if (flag)
			rad = 0.0F;
		else
			rad = (float) ((double) rad_step / 2D);
		for (int i = 0; i < tamaNum;) {
			vxCircle[i] = (float) (Math.cos(rad) * (double) speed);
			vyCircle[i] = (float) (Math.sin(rad) * (double) speed);
			GamePanel.addList(new EnemyShot(x, y, vxCircle[i], vyCircle[i]));
			i++;
			rad += rad_step;
		}

		vx = vxCircle[0];
		vy = vyCircle[0];
	}

}
