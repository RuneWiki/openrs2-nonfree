package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class170 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "[Lclient!fq;")
	public Class180[] aClass180Array1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/lang/String;")
	public String aString163;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Ljava/lang/String;")
	public String aString164;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Ljava/lang/String;")
	public String aString165;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[Lclient!fq;")
	public Class180[] aClass180Array2;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 99)
	Class170() {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!fj;)V", line = 102)
	void method23356(@OriginalArg(0) Class174 arg0) {
		this.aString165 = arg0.method23391();
		this.aString163 = arg0.method23391();
		this.aString164 = arg0.method23391();
		@Pc(18) int local18 = arg0.method23393();
		@Pc(22) int local22 = arg0.method23393();
		this.aClass180Array1 = local18 == 0 ? null : new Class180[local18];
		this.aClass180Array2 = local22 == 0 ? null : new Class180[local22];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local18; local41++) {
			this.aClass180Array1[local41] = new Class180();
			this.aClass180Array1[local41].method23536(arg0);
		}
		for (local41 = 0; local41 < local22; local41++) {
			this.aClass180Array2[local41] = new Class180();
			this.aClass180Array2[local41].method23536(arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "(Lclient!fj;I)V", line = 102)
	void method23357(@OriginalArg(0) Class174 arg0) {
		this.aString165 = arg0.method23391();
		this.aString163 = arg0.method23391();
		this.aString164 = arg0.method23391();
		@Pc(18) int local18 = arg0.method23393();
		@Pc(22) int local22 = arg0.method23393();
		this.aClass180Array1 = local18 == 0 ? null : new Class180[local18];
		this.aClass180Array2 = local22 == 0 ? null : new Class180[local22];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local18; local41++) {
			this.aClass180Array1[local41] = new Class180();
			this.aClass180Array1[local41].method23536(arg0);
		}
		for (local41 = 0; local41 < local22; local41++) {
			this.aClass180Array2[local41] = new Class180();
			this.aClass180Array2[local41].method23536(arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(Lclient!fj;)V", line = 102)
	void method23358(@OriginalArg(0) Class174 arg0) {
		this.aString165 = arg0.method23391();
		this.aString163 = arg0.method23391();
		this.aString164 = arg0.method23391();
		@Pc(18) int local18 = arg0.method23393();
		@Pc(22) int local22 = arg0.method23393();
		this.aClass180Array1 = local18 == 0 ? null : new Class180[local18];
		this.aClass180Array2 = local22 == 0 ? null : new Class180[local22];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local18; local41++) {
			this.aClass180Array1[local41] = new Class180();
			this.aClass180Array1[local41].method23536(arg0);
		}
		for (local41 = 0; local41 < local22; local41++) {
			this.aClass180Array2[local41] = new Class180();
			this.aClass180Array2[local41].method23536(arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "([J[Ljava/lang/Object;B)V", line = 208)
	public static void method23361(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class217.method24350(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ff", name = "lu", descriptor = "(B)V", line = 11054)
	static final void method23362() {
		Class223.method24442(client.aClass178_13);
		Class3_Sub39.anInt1355 += -1547307649;
		if (client.aBoolean603 && client.aBoolean601) {
			@Pc(24) int local24 = Class3_Sub10.aClass61_1.method12740();
			@Pc(28) int local28 = Class3_Sub10.aClass61_1.method12741();
			local24 -= client.anInt3043 * -2107267501;
			local28 -= client.anInt3132 * -1060157265;
			if (local24 < client.anInt3134 * 796552157) {
				local24 = client.anInt3134 * 796552157;
			}
			if (client.aClass178_13.anInt3498 * -1494060731 + local24 > client.anInt3134 * 796552157 + client.anInt3135 * 1764972057) {
				local24 = client.anInt3135 * 1764972057 + client.anInt3134 * 796552157 - client.aClass178_13.anInt3498 * -1494060731;
			}
			if (local28 < client.anInt3036 * 346295443) {
				local28 = client.anInt3036 * 346295443;
			}
			if (local28 + client.aClass178_13.anInt3499 * -751005789 > client.anInt3063 * -964554425 + client.anInt3036 * 346295443) {
				local28 = client.anInt3063 * -964554425 + client.anInt3036 * 346295443 - client.aClass178_13.anInt3499 * -751005789;
			}
			@Pc(117) int local117;
			@Pc(119) int local119;
			if (client.aClass178_11 == Class424.aClass178_16) {
				local117 = local24;
				local119 = local28;
			} else {
				local117 = client.aClass178_11.anInt3573 * 598019781 + (local24 - client.anInt3134 * 796552157);
				local119 = local28 - client.anInt3036 * 346295443 + client.aClass178_11.anInt3557 * 1648318741;
			}
			@Pc(158) Class3_Sub17 local158;
			if (Class3_Sub10.aClass61_1.method12753()) {
				if (Class3_Sub39.anInt1355 * -1888761217 > client.aClass178_13.anInt3515 * -558551411) {
					@Pc(322) int local322 = local24 - client.anInt3136 * 1738170853;
					@Pc(328) int local328 = local28 - client.anInt3128 * -989037753;
					if (local322 > client.aClass178_13.anInt3549 * -2023386387 || local322 < -(client.aClass178_13.anInt3549 * -2023386387) || local328 > client.aClass178_13.anInt3549 * -2023386387 || local328 < -(client.aClass178_13.anInt3549 * -2023386387)) {
						client.aBoolean604 = true;
					}
				}
				if (client.aClass178_13.anObjectArray15 != null && client.aBoolean604) {
					local158 = new Class3_Sub17();
					local158.aClass178_2 = client.aClass178_13;
					local158.anInt1257 = local117 * 2003855759;
					local158.anInt1258 = local119 * -2137430723;
					local158.anObjectArray1 = client.aClass178_13.anObjectArray15;
					Class410.method27671(local158);
				}
			} else {
				if (client.aBoolean604) {
					Class44_Sub2.method15142();
					if (client.aClass178_13.anObjectArray37 != null) {
						local158 = new Class3_Sub17();
						local158.aClass178_2 = client.aClass178_13;
						local158.anInt1257 = local117 * 2003855759;
						local158.anInt1258 = local119 * -2137430723;
						@Pc(174) Class178 local174 = client.method22682(client.aClass178_13);
						@Pc(176) Class178 local176 = client.aClass178_9;
						@Pc(178) boolean local178 = false;
						while (local176 != null && local176.anInt3500 * 610124465 != -1 && local174 != null) {
							if (local176.anInt3570 * 954808515 == local174.anInt3570 * 954808515) {
								local178 = true;
								break;
							}
							local176 = Class178.aClass186Array1[local176.anInt3570 * 954808515 >> 16].aClass178Array8[local176.anInt3500 * 610124465 & 0xFFFF];
						}
						if (local176 == null || local174 == null || Class424.aClass178_16 == local174 || local178) {
							local158.aClass178_3 = client.aClass178_9;
						} else {
							local158.aClass178_3 = Class424.aClass178_16;
						}
						local158.anObjectArray1 = client.aClass178_13.anObjectArray37;
						Class410.method27671(local158);
					}
					if (client.aClass178_9 != null && client.method22682(client.aClass178_13) != null) {
						Class117.method22816(client.aClass178_13, client.aClass178_9);
					}
				} else if ((client.anInt3119 * 775790181 == 1 || Class549.method32673()) && Class250.anInt3811 * -1176041819 > 2) {
					Class600.method33509(client.anInt3136 * 1738170853 + client.anInt3043 * -2107267501, client.anInt3128 * -989037753 + client.anInt3132 * -1060157265);
				} else if (Class381.method27302()) {
					Class600.method33509(client.anInt3043 * -2107267501 + client.anInt3136 * 1738170853, client.anInt3132 * -1060157265 + client.anInt3128 * -989037753);
				}
				client.aClass178_13 = null;
				client.aClass178_11 = null;
			}
		} else if (Class3_Sub39.anInt1355 * -1888761217 > 1) {
			client.aClass178_13 = null;
			client.aClass178_11 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "asy", descriptor = "(Lclient!vs;I)V", line = 12251)
	static final void method23359(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 != -1) {
			Class36_Sub2.method8322(local12);
		}
	}

	@OriginalMember(owner = "client!ff", name = "ava", descriptor = "(Lclient!vs;I)V", line = 12729)
	static void method23360(@OriginalArg(0) Class536 arg0) {
		@Pc(9) int local9 = arg0.anIntArray496[arg0.anInt5319 * 960738381 - 3];
		@Pc(19) int local19 = arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2];
		@Pc(29) int local29 = arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1];
		arg0.anInt5319 -= 936373647;
		if (local9 > arg0.anIntArray495[local19]) {
			throw new RuntimeException();
		} else if (local9 > arg0.anIntArray495[local29]) {
			throw new RuntimeException();
		} else if (local19 == local29) {
			throw new RuntimeException();
		} else {
			Class392.method27426(arg0.anIntArrayArray62[local19], arg0.anIntArrayArray62[local29], 0, local9 - 1);
		}
	}
}
