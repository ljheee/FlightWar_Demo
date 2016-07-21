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
public class EnemyTable {
	public int time;

	public float x;

	public float y;

	public int enemyKind;

	public int pattern;

	public EnemyTable(int enemyKind, int time, float x, float y, int pattern) {
		this.enemyKind = enemyKind;
		this.time = time;
		this.x = x;
		this.y = y;
		this.pattern = pattern;
	}

}
