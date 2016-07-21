package org.game.simple;

import java.awt.Color;
import java.awt.Graphics;
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
public class Power {

	private int power;

	private int powerMax;

	public Power(int power) {
		this.power = power;
		powerMax = power;
	}

	public void damage(int dmg) {
		power -= dmg;
	}

	public int getPower() {
		return power;
	}

	public void reflesh() {
		power = powerMax;
	}

	public void drawZikiPower(Graphics g) {
		g.setColor(Color.white);
		g.drawRect(380, 450, 50, 15);
		g.setColor(Color.green);
		g.fillRect(381, 451,
				(int) ((50D / (double) (float) powerMax) * (double) power) - 1,
				14);
	}

	public void drawBossPower(Graphics g) {
		g.setColor(Color.white);
		g.drawRect(200, 20, 150, 15);
		g.setColor(Color.green);
		g
				.fillRect(
						201,
						21,
						(int) ((150D / (double) (float) powerMax) * (double) power) - 1,
						14);
	}

}
