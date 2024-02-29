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

@OriginalClass("client!xe")
public class Class640 {

	@OriginalMember(owner = "client!xe", name = "p", descriptor = "J")
	static long aLong303 = 2887650411480147785L;

	@OriginalMember(owner = "client!xe", name = "c", descriptor = "I")
	static int anInt5721 = 0;

	@OriginalMember(owner = "client!xe", name = "v", descriptor = "Z")
	static boolean aBoolean852 = true;

	@OriginalMember(owner = "client!xe", name = "l", descriptor = "Lclient!alz;")
	static final Class147_Sub2 aClass147_Sub2_1 = new Class147_Sub2();

	@OriginalMember(owner = "client!xe", name = "y", descriptor = "Lclient!alx;")
	static final Class147_Sub1 aClass147_Sub1_1 = new Class147_Sub1();

	@OriginalMember(owner = "client!xe", name = "w", descriptor = "Ljava/util/Queue;")
	static Queue aQueue3 = new LinkedList();

	@OriginalMember(owner = "client!xe", name = "<init>", descriptor = "()V", line = 35)
	Class640() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xe", name = "x", descriptor = "()V", line = 40)
	public static void method32734() {
		if (Class403.method28510()) {
			Class582.method31707(new Class644());
		}
	}

	@OriginalMember(owner = "client!xe", name = "d", descriptor = "()V", line = 40)
	public static void method32735() {
		if (Class403.method28510()) {
			Class582.method31707(new Class644());
		}
	}

	@OriginalMember(owner = "client!xe", name = "q", descriptor = "()V", line = 40)
	public static void method32736() {
		if (Class403.method28510()) {
			Class582.method31707(new Class644());
		}
	}

	@OriginalMember(owner = "client!xe", name = "r", descriptor = "()V", line = 56)
	public static void method32737() {
		Class659.method33063();
	}

	@OriginalMember(owner = "client!xe", name = "s", descriptor = "()V", line = 56)
	public static void method32738() {
		Class659.method33063();
	}

	@OriginalMember(owner = "client!xe", name = "g", descriptor = "()V", line = 60)
	public static void method32739() {
		aClass147_Sub2_1.method15610();
		aClass147_Sub1_1.method15610();
		aLong303 = 2887650411480147785L;
		aBoolean852 = true;
	}

	@OriginalMember(owner = "client!xe", name = "z", descriptor = "()V", line = 75)
	static void method32740() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class470.aCanvas6.isShowing()) {
				local9 = Class470.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class77_Sub42_Sub1 local16 = (Class77_Sub42_Sub1) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class470.aCanvas6.isShowing() && Class77_Sub36.aBoolean351) {
						local16.method22386(local9);
						if (!local16.method22385() && local16.method22716() < Class149_Sub4.anInt2368 * 1771907305 && local16.method22717() < Class19.anInt108 * -1091172141 && local16.method22716() >= 0 && local16.method22717() >= 0) {
							@Pc(68) int local68 = local16.method22715();
							if (local16.method22715() == -1) {
								aClass147_Sub1_1.method15614(local16);
							} else if (Class412.method28581(local68)) {
								aClass147_Sub1_1.method15559(local16);
							}
						}
					} else {
						local16.method22720();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xe", name = "j", descriptor = "()V", line = 75)
	static void method32741() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class470.aCanvas6.isShowing()) {
				local9 = Class470.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class77_Sub42_Sub1 local16 = (Class77_Sub42_Sub1) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class470.aCanvas6.isShowing() && Class77_Sub36.aBoolean351) {
						local16.method22386(local9);
						if (!local16.method22385() && local16.method22716() < Class149_Sub4.anInt2368 * 1771907305 && local16.method22717() < Class19.anInt108 * -1091172141 && local16.method22716() >= 0 && local16.method22717() >= 0) {
							@Pc(68) int local68 = local16.method22715();
							if (local16.method22715() == -1) {
								aClass147_Sub1_1.method15614(local16);
							} else if (Class412.method28581(local68)) {
								aClass147_Sub1_1.method15559(local16);
							}
						}
					} else {
						local16.method22720();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xe", name = "i", descriptor = "()V", line = 75)
	static void method32742() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			@Pc(9) Point local9;
			if (Class470.aCanvas6.isShowing()) {
				local9 = Class470.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class77_Sub42_Sub1 local16 = (Class77_Sub42_Sub1) aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class470.aCanvas6.isShowing() && Class77_Sub36.aBoolean351) {
						local16.method22386(local9);
						if (!local16.method22385() && local16.method22716() < Class149_Sub4.anInt2368 * 1771907305 && local16.method22717() < Class19.anInt108 * -1091172141 && local16.method22716() >= 0 && local16.method22717() >= 0) {
							@Pc(68) int local68 = local16.method22715();
							if (local16.method22715() == -1) {
								aClass147_Sub1_1.method15614(local16);
							} else if (Class412.method28581(local68)) {
								aClass147_Sub1_1.method15559(local16);
							}
						}
					} else {
						local16.method22720();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xe", name = "u", descriptor = "()V", line = 103)
	public static void method32743() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			while (true) {
				@Pc(7) Class77_Sub42_Sub1 local7 = (Class77_Sub42_Sub1) aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method22720();
			}
		}
	}

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "()V", line = 103)
	public static void method32744() {
		@Pc(2) Queue local2 = aQueue3;
		synchronized (aQueue3) {
			while (true) {
				@Pc(7) Class77_Sub42_Sub1 local7 = (Class77_Sub42_Sub1) aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method22720();
			}
		}
	}

	@OriginalMember(owner = "client!xe", name = "e", descriptor = "()V", line = 113)
	public static void method32745() {
		Class474.method29676();
		aClass147_Sub2_1.method15607();
		aClass147_Sub1_1.method15607();
		@Pc(17) Class77_Sub20 local17;
		@Pc(26) int local26;
		if (client.anInt3468 * -2064179505 > 0) {
			local17 = Class365.method28132(Class414.aClass414_79, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22408(client.anInt3468 * 333216572);
			for (local26 = 0; local26 < client.anInt3468 * -2064179505; local26++) {
				@Pc(35) Interface62 local35 = client.anInterface62Array2[local26];
				@Pc(43) long local43 = local35.method14148() - aLong303 * 3448347234370012423L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong303 = local35.method14148() * -2887650411480147785L;
				local17.aClass77_Sub39_Sub1_2.method22403(local35.method14158());
				local17.aClass77_Sub39_Sub1_2.method22413((int) local43);
			}
			client.aClass82_2.method2004(local17);
		}
		if (anInt5721 * -152420315 > 0) {
			anInt5721 -= 1972886445;
		}
		if (client.aBoolean612 && anInt5721 * -152420315 <= 0) {
			anInt5721 = 803023236;
			client.aBoolean612 = false;
			@Pc(114) int local114;
			if (Class11.anInt36 * -891094135 != 3) {
				local114 = (int) client.aFloat249 >> 3;
				local26 = (int) client.aFloat247 >> 3;
			} else if (Class597.aClass107_Sub1_2.method8880() == Class331.aClass331_4) {
				@Pc(107) Class115_Sub1 local107 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
				local114 = Class547.method30972(local107.aClass452_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class579.method31668(local107.aClass452_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class77_Sub20 local153 = Class365.method28132(Class414.aClass414_36, client.aClass82_2.aClass16_1);
			local153.aClass77_Sub39_Sub1_2.method22609(local114);
			local153.aClass77_Sub39_Sub1_2.method22408(local26);
			client.aClass82_2.method2004(local153);
		}
		if (Class77_Sub36.aBoolean351 != aBoolean852) {
			aBoolean852 = Class77_Sub36.aBoolean351;
			local17 = Class365.method28132(Class414.aClass414_31, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(Class77_Sub36.aBoolean351 ? 1 : 0);
			client.aClass82_2.method2004(local17);
		}
		if (!client.aBoolean593) {
			local17 = Class365.method28132(Class414.aClass414_114, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(0);
			local26 = local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
			@Pc(214) Class77_Sub39 local214 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local17.aClass77_Sub39_Sub1_2.method22452(local214.aByteArray53, 0, local214.anInt3089 * 31645619);
			local17.aClass77_Sub39_Sub1_2.method22463(local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local26);
			client.aClass82_2.method2004(local17);
			client.aBoolean593 = true;
		}
		if (client.aBoolean594 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class284.aClass86_9.method20060();
		@Pc(259) Class77_Sub20 local259 = Class365.method28132(Class414.aClass414_74, client.aClass82_2.aClass16_1);
		local259.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(270) int local270 = local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		if (local253 == null || local253.length == 0) {
			local259.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local259.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(284) Class174[] local284 = Class174.method24548();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class256.method26214(local288, local259.aClass77_Sub39_Sub1_2);
					local259.aClass77_Sub39_Sub1_2.method22469(local292.size());
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
					local259.aClass77_Sub39_Sub1_2.method22474(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass77_Sub39_Sub1_2.method22474(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3296 == local253[local294]) {
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
		local259.aClass77_Sub39_Sub1_2.method22462(local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local270);
		client.aClass82_2.method2004(local259);
		client.aBoolean594 = true;
	}

	@OriginalMember(owner = "client!xe", name = "b", descriptor = "()V", line = 113)
	public static void method32746() {
		Class474.method29676();
		aClass147_Sub2_1.method15607();
		aClass147_Sub1_1.method15607();
		@Pc(17) Class77_Sub20 local17;
		@Pc(26) int local26;
		if (client.anInt3468 * -2064179505 > 0) {
			local17 = Class365.method28132(Class414.aClass414_79, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22408(client.anInt3468 * 333216572);
			for (local26 = 0; local26 < client.anInt3468 * -2064179505; local26++) {
				@Pc(35) Interface62 local35 = client.anInterface62Array2[local26];
				@Pc(43) long local43 = local35.method14148() - aLong303 * 3448347234370012423L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong303 = local35.method14148() * -2887650411480147785L;
				local17.aClass77_Sub39_Sub1_2.method22403(local35.method14158());
				local17.aClass77_Sub39_Sub1_2.method22413((int) local43);
			}
			client.aClass82_2.method2004(local17);
		}
		if (anInt5721 * -152420315 > 0) {
			anInt5721 -= 1972886445;
		}
		if (client.aBoolean612 && anInt5721 * -152420315 <= 0) {
			anInt5721 = 803023236;
			client.aBoolean612 = false;
			@Pc(114) int local114;
			if (Class11.anInt36 * -891094135 != 3) {
				local114 = (int) client.aFloat249 >> 3;
				local26 = (int) client.aFloat247 >> 3;
			} else if (Class597.aClass107_Sub1_2.method8880() == Class331.aClass331_4) {
				@Pc(107) Class115_Sub1 local107 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
				local114 = Class547.method30972(local107.aClass452_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class579.method31668(local107.aClass452_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class77_Sub20 local153 = Class365.method28132(Class414.aClass414_36, client.aClass82_2.aClass16_1);
			local153.aClass77_Sub39_Sub1_2.method22609(local114);
			local153.aClass77_Sub39_Sub1_2.method22408(local26);
			client.aClass82_2.method2004(local153);
		}
		if (Class77_Sub36.aBoolean351 != aBoolean852) {
			aBoolean852 = Class77_Sub36.aBoolean351;
			local17 = Class365.method28132(Class414.aClass414_31, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(Class77_Sub36.aBoolean351 ? 1 : 0);
			client.aClass82_2.method2004(local17);
		}
		if (!client.aBoolean593) {
			local17 = Class365.method28132(Class414.aClass414_114, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(0);
			local26 = local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
			@Pc(214) Class77_Sub39 local214 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local17.aClass77_Sub39_Sub1_2.method22452(local214.aByteArray53, 0, local214.anInt3089 * 31645619);
			local17.aClass77_Sub39_Sub1_2.method22463(local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local26);
			client.aClass82_2.method2004(local17);
			client.aBoolean593 = true;
		}
		if (client.aBoolean594 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class284.aClass86_9.method20060();
		@Pc(259) Class77_Sub20 local259 = Class365.method28132(Class414.aClass414_74, client.aClass82_2.aClass16_1);
		local259.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(270) int local270 = local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		if (local253 == null || local253.length == 0) {
			local259.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local259.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(284) Class174[] local284 = Class174.method24548();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class256.method26214(local288, local259.aClass77_Sub39_Sub1_2);
					local259.aClass77_Sub39_Sub1_2.method22469(local292.size());
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
					local259.aClass77_Sub39_Sub1_2.method22474(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass77_Sub39_Sub1_2.method22474(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3296 == local253[local294]) {
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
		local259.aClass77_Sub39_Sub1_2.method22462(local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local270);
		client.aClass82_2.method2004(local259);
		client.aBoolean594 = true;
	}

	@OriginalMember(owner = "client!xe", name = "f", descriptor = "()V", line = 113)
	public static void method32747() {
		Class474.method29676();
		aClass147_Sub2_1.method15607();
		aClass147_Sub1_1.method15607();
		@Pc(17) Class77_Sub20 local17;
		@Pc(26) int local26;
		if (client.anInt3468 * -2064179505 > 0) {
			local17 = Class365.method28132(Class414.aClass414_79, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22408(client.anInt3468 * 333216572);
			for (local26 = 0; local26 < client.anInt3468 * -2064179505; local26++) {
				@Pc(35) Interface62 local35 = client.anInterface62Array2[local26];
				@Pc(43) long local43 = local35.method14148() - aLong303 * 3448347234370012423L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong303 = local35.method14148() * -2887650411480147785L;
				local17.aClass77_Sub39_Sub1_2.method22403(local35.method14158());
				local17.aClass77_Sub39_Sub1_2.method22413((int) local43);
			}
			client.aClass82_2.method2004(local17);
		}
		if (anInt5721 * -152420315 > 0) {
			anInt5721 -= 1972886445;
		}
		if (client.aBoolean612 && anInt5721 * -152420315 <= 0) {
			anInt5721 = 803023236;
			client.aBoolean612 = false;
			@Pc(114) int local114;
			if (Class11.anInt36 * -891094135 != 3) {
				local114 = (int) client.aFloat249 >> 3;
				local26 = (int) client.aFloat247 >> 3;
			} else if (Class597.aClass107_Sub1_2.method8880() == Class331.aClass331_4) {
				@Pc(107) Class115_Sub1 local107 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
				local114 = Class547.method30972(local107.aClass452_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class579.method31668(local107.aClass452_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class77_Sub20 local153 = Class365.method28132(Class414.aClass414_36, client.aClass82_2.aClass16_1);
			local153.aClass77_Sub39_Sub1_2.method22609(local114);
			local153.aClass77_Sub39_Sub1_2.method22408(local26);
			client.aClass82_2.method2004(local153);
		}
		if (Class77_Sub36.aBoolean351 != aBoolean852) {
			aBoolean852 = Class77_Sub36.aBoolean351;
			local17 = Class365.method28132(Class414.aClass414_31, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(Class77_Sub36.aBoolean351 ? 1 : 0);
			client.aClass82_2.method2004(local17);
		}
		if (!client.aBoolean593) {
			local17 = Class365.method28132(Class414.aClass414_114, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(0);
			local26 = local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
			@Pc(214) Class77_Sub39 local214 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local17.aClass77_Sub39_Sub1_2.method22452(local214.aByteArray53, 0, local214.anInt3089 * 31645619);
			local17.aClass77_Sub39_Sub1_2.method22463(local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local26);
			client.aClass82_2.method2004(local17);
			client.aBoolean593 = true;
		}
		if (client.aBoolean594 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class284.aClass86_9.method20060();
		@Pc(259) Class77_Sub20 local259 = Class365.method28132(Class414.aClass414_74, client.aClass82_2.aClass16_1);
		local259.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(270) int local270 = local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		if (local253 == null || local253.length == 0) {
			local259.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local259.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(284) Class174[] local284 = Class174.method24548();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class256.method26214(local288, local259.aClass77_Sub39_Sub1_2);
					local259.aClass77_Sub39_Sub1_2.method22469(local292.size());
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
					local259.aClass77_Sub39_Sub1_2.method22474(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass77_Sub39_Sub1_2.method22474(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3296 == local253[local294]) {
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
		local259.aClass77_Sub39_Sub1_2.method22462(local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local270);
		client.aClass82_2.method2004(local259);
		client.aBoolean594 = true;
	}

	@OriginalMember(owner = "client!xe", name = "o", descriptor = "()V", line = 113)
	public static void method32748() {
		Class474.method29676();
		aClass147_Sub2_1.method15607();
		aClass147_Sub1_1.method15607();
		@Pc(17) Class77_Sub20 local17;
		@Pc(26) int local26;
		if (client.anInt3468 * -2064179505 > 0) {
			local17 = Class365.method28132(Class414.aClass414_79, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22408(client.anInt3468 * 333216572);
			for (local26 = 0; local26 < client.anInt3468 * -2064179505; local26++) {
				@Pc(35) Interface62 local35 = client.anInterface62Array2[local26];
				@Pc(43) long local43 = local35.method14148() - aLong303 * 3448347234370012423L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong303 = local35.method14148() * -2887650411480147785L;
				local17.aClass77_Sub39_Sub1_2.method22403(local35.method14158());
				local17.aClass77_Sub39_Sub1_2.method22413((int) local43);
			}
			client.aClass82_2.method2004(local17);
		}
		if (anInt5721 * -152420315 > 0) {
			anInt5721 -= 1972886445;
		}
		if (client.aBoolean612 && anInt5721 * -152420315 <= 0) {
			anInt5721 = 803023236;
			client.aBoolean612 = false;
			@Pc(114) int local114;
			if (Class11.anInt36 * -891094135 != 3) {
				local114 = (int) client.aFloat249 >> 3;
				local26 = (int) client.aFloat247 >> 3;
			} else if (Class597.aClass107_Sub1_2.method8880() == Class331.aClass331_4) {
				@Pc(107) Class115_Sub1 local107 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
				local114 = Class547.method30972(local107.aClass452_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class579.method31668(local107.aClass452_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class77_Sub20 local153 = Class365.method28132(Class414.aClass414_36, client.aClass82_2.aClass16_1);
			local153.aClass77_Sub39_Sub1_2.method22609(local114);
			local153.aClass77_Sub39_Sub1_2.method22408(local26);
			client.aClass82_2.method2004(local153);
		}
		if (Class77_Sub36.aBoolean351 != aBoolean852) {
			aBoolean852 = Class77_Sub36.aBoolean351;
			local17 = Class365.method28132(Class414.aClass414_31, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(Class77_Sub36.aBoolean351 ? 1 : 0);
			client.aClass82_2.method2004(local17);
		}
		if (!client.aBoolean593) {
			local17 = Class365.method28132(Class414.aClass414_114, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(0);
			local26 = local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
			@Pc(214) Class77_Sub39 local214 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local17.aClass77_Sub39_Sub1_2.method22452(local214.aByteArray53, 0, local214.anInt3089 * 31645619);
			local17.aClass77_Sub39_Sub1_2.method22463(local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local26);
			client.aClass82_2.method2004(local17);
			client.aBoolean593 = true;
		}
		if (client.aBoolean594 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class284.aClass86_9.method20060();
		@Pc(259) Class77_Sub20 local259 = Class365.method28132(Class414.aClass414_74, client.aClass82_2.aClass16_1);
		local259.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(270) int local270 = local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		if (local253 == null || local253.length == 0) {
			local259.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local259.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(284) Class174[] local284 = Class174.method24548();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class256.method26214(local288, local259.aClass77_Sub39_Sub1_2);
					local259.aClass77_Sub39_Sub1_2.method22469(local292.size());
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
					local259.aClass77_Sub39_Sub1_2.method22474(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass77_Sub39_Sub1_2.method22474(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3296 == local253[local294]) {
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
		local259.aClass77_Sub39_Sub1_2.method22462(local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local270);
		client.aClass82_2.method2004(local259);
		client.aBoolean594 = true;
	}

	@OriginalMember(owner = "client!xe", name = "ayo", descriptor = "(Lclient!yf;I)V", line = 13655)
	static final void method32749(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class508.aString221.startsWith("win") ? 1 : 0;
	}

	@OriginalMember(owner = "client!xe", name = "azk", descriptor = "(Lclient!yf;B)V", line = 13795)
	static final void method32750(@OriginalArg(0) Class665 arg0) {
		Class205.aClass299_1.method27093();
	}
}
