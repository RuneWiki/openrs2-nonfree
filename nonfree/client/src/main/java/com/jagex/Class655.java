package com.jagex;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xc")
public class Class655 {

	@OriginalMember(owner = "client!xc", name = "ku", descriptor = "I")
	public static int anInt5809;

	@OriginalMember(owner = "client!xc", name = "e", descriptor = "J")
	static long aLong299 = 2492000195029924361L;

	@OriginalMember(owner = "client!xc", name = "n", descriptor = "I")
	static int anInt5808 = 0;

	@OriginalMember(owner = "client!xc", name = "m", descriptor = "Z")
	static boolean aBoolean861 = true;

	@OriginalMember(owner = "client!xc", name = "k", descriptor = "Lclient!alt;")
	static final Class163_Sub2 aClass163_Sub2_1 = new Class163_Sub2();

	@OriginalMember(owner = "client!xc", name = "f", descriptor = "Lclient!alp;")
	static final Class163_Sub1 aClass163_Sub1_1 = new Class163_Sub1();

	@OriginalMember(owner = "client!xc", name = "w", descriptor = "Ljava/util/Queue;")
	static Queue aQueue3 = new LinkedList();

	@OriginalMember(owner = "client!xc", name = "<init>", descriptor = "()V", line = 35)
	Class655() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xc", name = "m", descriptor = "(II)I", line = 39)
	static final int method32745(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!xc", name = "u", descriptor = "()V", line = 40)
	public static void method32723() {
		if (Class127.method9264()) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668());
		}
	}

	@OriginalMember(owner = "client!xc", name = "p", descriptor = "()V", line = 40)
	public static void method32724() {
		if (Class127.method9264()) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668());
		}
	}

	@OriginalMember(owner = "client!xc", name = "d", descriptor = "()V", line = 40)
	public static void method32725() {
		if (Class127.method9264()) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668());
		}
	}

	@OriginalMember(owner = "client!xc", name = "z", descriptor = "()V", line = 40)
	public static void method32732() {
		if (Class127.method9264()) {
			Class132_Sub1_Sub3_Sub1.method12302(new Class668());
		}
	}

	@OriginalMember(owner = "client!xc", name = "c", descriptor = "()V", line = 56)
	public static void method32726() {
		Class693.method36617();
	}

	@OriginalMember(owner = "client!xc", name = "r", descriptor = "()V", line = 60)
	public static void method32727() {
		aClass163_Sub2_1.method14902();
		aClass163_Sub1_1.method14902();
		aLong299 = 2492000195029924361L;
		aBoolean861 = true;
	}

	@OriginalMember(owner = "client!xc", name = "v", descriptor = "()V", line = 60)
	public static void method32736() {
		aClass163_Sub2_1.method14902();
		aClass163_Sub1_1.method14902();
		aLong299 = 2492000195029924361L;
		aBoolean861 = true;
	}

	@OriginalMember(owner = "client!xc", name = "o", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32729(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901)) {
			aClass163_Sub2_1.method14903(arg0);
		} else {
			arg0.method22877();
		}
	}

	@OriginalMember(owner = "client!xc", name = "s", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32730(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901)) {
			aClass163_Sub2_1.method14903(arg0);
		} else {
			arg0.method22877();
		}
	}

	@OriginalMember(owner = "client!xc", name = "y", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32731(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901)) {
			aClass163_Sub2_1.method14903(arg0);
		} else {
			arg0.method22877();
		}
	}

	@OriginalMember(owner = "client!xc", name = "x", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32733(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901)) {
			aClass163_Sub2_1.method14903(arg0);
		} else {
			arg0.method22877();
		}
	}

	@OriginalMember(owner = "client!xc", name = "q", descriptor = "(Lclient!akm;)V", line = 67)
	public static void method32739(@OriginalArg(0) Class93_Sub23 arg0) {
		if (Class106.method7580(client.anInt3435 * -849002901)) {
			aClass163_Sub2_1.method14903(arg0);
		} else {
			arg0.method22877();
		}
	}

	@OriginalMember(owner = "client!xc", name = "g", descriptor = "()V", line = 75)
	static void method32722() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22897(local9);
						if (!local16.method22896() && local16.method22873() < Class553.anInt3408 * -1378711501 && local16.method22874() < Class553.anInt3416 * 2091353777 && local16.method22873() >= 0 && local16.method22874() >= 0) {
							@Pc(67) int local67 = local16.method22890();
							if (local16.method22890() == -1) {
								aClass163_Sub1_1.method14903(local16);
							} else if (Class64.method1163(local67)) {
								aClass163_Sub1_1.method14845(local16);
							}
						}
					} else {
						local16.method22877();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "a", descriptor = "()V", line = 75)
	static void method32728() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22897(local9);
						if (!local16.method22896() && local16.method22873() < Class553.anInt3408 * -1378711501 && local16.method22874() < Class553.anInt3416 * 2091353777 && local16.method22873() >= 0 && local16.method22874() >= 0) {
							@Pc(67) int local67 = local16.method22890();
							if (local16.method22890() == -1) {
								aClass163_Sub1_1.method14903(local16);
							} else if (Class64.method1163(local67)) {
								aClass163_Sub1_1.method14845(local16);
							}
						}
					} else {
						local16.method22877();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "b", descriptor = "()V", line = 75)
	static void method32734() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22897(local9);
						if (!local16.method22896() && local16.method22873() < Class553.anInt3408 * -1378711501 && local16.method22874() < Class553.anInt3416 * 2091353777 && local16.method22873() >= 0 && local16.method22874() >= 0) {
							@Pc(67) int local67 = local16.method22890();
							if (local16.method22890() == -1) {
								aClass163_Sub1_1.method14903(local16);
							} else if (Class64.method1163(local67)) {
								aClass163_Sub1_1.method14845(local16);
							}
						}
					} else {
						local16.method22877();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "h", descriptor = "()V", line = 75)
	static void method32735() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class125_Sub3.aCanvas1.isShowing()) {
				local9 = Class125_Sub3.aCanvas1.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class93_Sub23_Sub2 local16 = (Class93_Sub23_Sub2) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class125_Sub3.aCanvas1.isShowing() && Class20.aBoolean10) {
						local16.method22897(local9);
						if (!local16.method22896() && local16.method22873() < Class553.anInt3408 * -1378711501 && local16.method22874() < Class553.anInt3416 * 2091353777 && local16.method22873() >= 0 && local16.method22874() >= 0) {
							@Pc(67) int local67 = local16.method22890();
							if (local16.method22890() == -1) {
								aClass163_Sub1_1.method14903(local16);
							} else if (Class64.method1163(local67)) {
								aClass163_Sub1_1.method14845(local16);
							}
						}
					} else {
						local16.method22877();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xc", name = "t", descriptor = "()V", line = 113)
	public static void method32721() {
		Class431.method28774();
		aClass163_Sub2_1.method14922();
		aClass163_Sub1_1.method14922();
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22454(client.anInt3450 * 541690580);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688() - aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong299 = local35.method13688() * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22510(local35.method13696());
				local17.aClass93_Sub41_Sub2_1.method22394((int) local43);
			}
			client.aClass175_2.method24351(local17);
		}
		if (anInt5808 * 660178843 > 0) {
			anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && anInt5808 * 660178843 <= 0) {
			anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023() == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
				local114 = Class155.method15307(local107.aClass471_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25652(local107.aClass471_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2);
			local153.aClass93_Sub41_Sub2_1.method22456(local26);
			local153.aClass93_Sub41_Sub2_1.method22454(local114);
			client.aClass175_2.method24351(local153);
		}
		if (Class20.aBoolean10 != aBoolean861) {
			aBoolean861 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(Class20.aBoolean10 ? 1 : 0);
			client.aClass175_2.method24351(local17);
		}
		if (!client.aBoolean601) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(0);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356();
			local17.aClass93_Sub41_Sub2_1.method22405(local214.aByteArray58, 0, local214.anInt3070 * 212851357);
			local17.aClass93_Sub41_Sub2_1.method22537(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26);
			client.aClass175_2.method24351(local17);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20712();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2);
		local259.aClass93_Sub41_Sub2_1.method22454(0);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(284) Class184[] local284 = Class184.method24580();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26463(local288, local259.aClass93_Sub41_Sub2_1);
					local259.aClass93_Sub41_Sub2_1.method22652(local292.size());
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.aClass93_Sub41_Sub2_1.method22411(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22411(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.aClass93_Sub41_Sub2_1.method22407(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270);
		client.aClass175_2.method24351(local259);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!xc", name = "i", descriptor = "()V", line = 113)
	public static void method32737() {
		Class431.method28774();
		aClass163_Sub2_1.method14922();
		aClass163_Sub1_1.method14922();
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22454(client.anInt3450 * 541690580);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688() - aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong299 = local35.method13688() * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22510(local35.method13696());
				local17.aClass93_Sub41_Sub2_1.method22394((int) local43);
			}
			client.aClass175_2.method24351(local17);
		}
		if (anInt5808 * 660178843 > 0) {
			anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && anInt5808 * 660178843 <= 0) {
			anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023() == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
				local114 = Class155.method15307(local107.aClass471_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25652(local107.aClass471_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2);
			local153.aClass93_Sub41_Sub2_1.method22456(local26);
			local153.aClass93_Sub41_Sub2_1.method22454(local114);
			client.aClass175_2.method24351(local153);
		}
		if (Class20.aBoolean10 != aBoolean861) {
			aBoolean861 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(Class20.aBoolean10 ? 1 : 0);
			client.aClass175_2.method24351(local17);
		}
		if (!client.aBoolean601) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(0);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356();
			local17.aClass93_Sub41_Sub2_1.method22405(local214.aByteArray58, 0, local214.anInt3070 * 212851357);
			local17.aClass93_Sub41_Sub2_1.method22537(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26);
			client.aClass175_2.method24351(local17);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20712();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2);
		local259.aClass93_Sub41_Sub2_1.method22454(0);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(284) Class184[] local284 = Class184.method24580();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26463(local288, local259.aClass93_Sub41_Sub2_1);
					local259.aClass93_Sub41_Sub2_1.method22652(local292.size());
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.aClass93_Sub41_Sub2_1.method22411(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22411(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.aClass93_Sub41_Sub2_1.method22407(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270);
		client.aClass175_2.method24351(local259);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!xc", name = "j", descriptor = "()V", line = 113)
	public static void method32738() {
		Class431.method28774();
		aClass163_Sub2_1.method14922();
		aClass163_Sub1_1.method14922();
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22454(client.anInt3450 * 541690580);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688() - aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong299 = local35.method13688() * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22510(local35.method13696());
				local17.aClass93_Sub41_Sub2_1.method22394((int) local43);
			}
			client.aClass175_2.method24351(local17);
		}
		if (anInt5808 * 660178843 > 0) {
			anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && anInt5808 * 660178843 <= 0) {
			anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023() == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
				local114 = Class155.method15307(local107.aClass471_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25652(local107.aClass471_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2);
			local153.aClass93_Sub41_Sub2_1.method22456(local26);
			local153.aClass93_Sub41_Sub2_1.method22454(local114);
			client.aClass175_2.method24351(local153);
		}
		if (Class20.aBoolean10 != aBoolean861) {
			aBoolean861 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(Class20.aBoolean10 ? 1 : 0);
			client.aClass175_2.method24351(local17);
		}
		if (!client.aBoolean601) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(0);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356();
			local17.aClass93_Sub41_Sub2_1.method22405(local214.aByteArray58, 0, local214.anInt3070 * 212851357);
			local17.aClass93_Sub41_Sub2_1.method22537(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26);
			client.aClass175_2.method24351(local17);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20712();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2);
		local259.aClass93_Sub41_Sub2_1.method22454(0);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(284) Class184[] local284 = Class184.method24580();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26463(local288, local259.aClass93_Sub41_Sub2_1);
					local259.aClass93_Sub41_Sub2_1.method22652(local292.size());
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.aClass93_Sub41_Sub2_1.method22411(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22411(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.aClass93_Sub41_Sub2_1.method22407(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270);
		client.aClass175_2.method24351(local259);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!xc", name = "dx", descriptor = "(Lclient!yf;B)V", line = 5646)
	static final void method32740(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class237.method25771(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xc", name = "aoh", descriptor = "(Lclient!yf;I)V", line = 12616)
	static final void method32741(@OriginalArg(0) Class681 arg0) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(26) float local26 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] / 1000.0F;
		Class65.aClass123_Sub1_2.method8944(local13, local26);
	}

	@OriginalMember(owner = "client!xc", name = "auq", descriptor = "(Lclient!yf;I)V", line = 13337)
	static final void method32742(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16343();
	}

	@OriginalMember(owner = "client!xc", name = "bar", descriptor = "(Lclient!yf;B)V", line = 14294)
	static final void method32743(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class694.aClass104_14.method20565()) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub28_1.method16543(local12);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 3;
		}
	}

	@OriginalMember(owner = "client!xc", name = "bbe", descriptor = "(Lclient!yf;I)V", line = 14421)
	static final void method32744(@OriginalArg(0) Class681 arg0) {
		@Pc(4) Class561 local4 = arg0.aClass132_Sub1_Sub1_Sub1_4.method19971();
		if (local4 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local4.method31138();
		}
	}
}
