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
public class StageA {
	static Battle _battle;

	static EnemyTable stageA[] = { new EnemyTable(0, 0, 25F, -50F, 0),
			new EnemyTable(0, 1, 25F, -50F, 0),
			new EnemyTable(0, 2, 30F, -50F, 0),
			new EnemyTable(0, 2, 20F, -50F, 2),
			new EnemyTable(0, 2, 100F, -50F, 2),
			new EnemyTable(0, 2, 200F, -50F, 2),
			new EnemyTable(0, 2, 300F, -50F, 2),
			new EnemyTable(0, 0, 250F, -50F, 1),
			new EnemyTable(0, 1, 300F, -50F, 1),
			new EnemyTable(0, 2, 330F, -50F, 1),
			new EnemyTable(0, 4, 20F, -50F, 2),
			new EnemyTable(0, 4, 100F, -50F, 2),
			new EnemyTable(0, 4, 200F, -50F, 2),
			new EnemyTable(0, 4, 300F, -50F, 2),
			new EnemyTable(0, 5, -50F, 400F, 5),
			new EnemyTable(0, 7, -50F, 430F, 5),
			new EnemyTable(0, 8, 20F, -50F, 2),
			new EnemyTable(0, 8, 100F, -50F, 2),
			new EnemyTable(0, 8, 200F, -50F, 2),
			new EnemyTable(0, 8, 300F, -50F, 2),
			new EnemyTable(0, 11, 550F, 430F, 6),
			new EnemyTable(0, 12, 550F, 410F, 6),
			new EnemyTable(0, 12, 20F, -50F, 2),
			new EnemyTable(0, 12, 100F, -50F, 2),
			new EnemyTable(0, 12, 200F, -50F, 2),
			new EnemyTable(0, 12, 300F, -50F, 2),
			new EnemyTable(1, 5, 250F, -50F, 0),
			new EnemyTable(3, 16, 450F, -50F, 1),
			new EnemyTable(0, 18, 20F, -50F, 2),
			new EnemyTable(0, 18, 100F, -50F, 2),
			new EnemyTable(0, 18, 200F, -50F, 2),
			new EnemyTable(0, 18, 300F, -50F, 2),
			new EnemyTable(3, 21, 0.0F, -50F, 0),
			new EnemyTable(0, 23, 20F, -50F, 2),
			new EnemyTable(0, 23, 100F, -50F, 2),
			new EnemyTable(0, 23, 200F, -50F, 2),
			new EnemyTable(0, 23, 300F, -50F, 2),
			new EnemyTable(3, 25, 450F, -50F, 1),
			new EnemyTable(0, 27, 20F, -50F, 2),
			new EnemyTable(0, 27, 100F, -50F, 2),
			new EnemyTable(0, 27, 200F, -50F, 2),
			new EnemyTable(0, 27, 300F, -50F, 2),
			new EnemyTable(2, 2, 20F, -50F, 0),
			new EnemyTable(0, 31, 20F, -50F, 2),
			new EnemyTable(0, 31, 100F, -50F, 2),
			new EnemyTable(0, 31, 200F, -50F, 2),
			new EnemyTable(0, 31, 300F, -50F, 2),
			new EnemyTable(2, 34, 350F, -50F, 0),
			new EnemyTable(0, 35, 20F, -50F, 2),
			new EnemyTable(0, 35, 100F, -50F, 2),
			new EnemyTable(0, 35, 200F, -50F, 2),
			new EnemyTable(0, 35, 300F, -50F, 2),
			new EnemyTable(1, 37, 300F, -50F, 0),
			new EnemyTable(3, 38, 200F, -50F, 0),
			new EnemyTable(0, 39, -50F, -50F, 4),
			new EnemyTable(0, 40, 500F, -50F, 5),
			new EnemyTable(2, 42, 200F, -50F, 0),
			new EnemyTable(0, 43, 200F, -50F, 2),
			new EnemyTable(0, 43, 300F, -50F, 2),
			new EnemyTable(4, 47, 0.0F, 0.0F, 0) };

	public StageA(Battle battle) {
		StageA._battle = battle;
	}

	public static void start() {
		for (int i = 0; i < stageA.length; i++)
			if ((double) stageA[i].time == (double) GamePanel.time / 50D)
				if (stageA[i].enemyKind == 0)
					GamePanel.addList(new EnemyA(stageA[i].x, stageA[i].y,
							_battle, stageA[i].pattern));
				else if (stageA[i].enemyKind == 1)
					GamePanel.addList(new EnemyB(stageA[i].x, stageA[i].y,
							_battle, stageA[i].pattern));
				else if (stageA[i].enemyKind == 2)
					GamePanel.addList(new EnemyC(stageA[i].x, stageA[i].y,
							_battle, stageA[i].pattern));
				else

				if (stageA[i].enemyKind == 4) {
					GamePanel.addList(new BossA(_battle));
				}

	}

	public static Battle getBattle() {
		return _battle;
	}

}
