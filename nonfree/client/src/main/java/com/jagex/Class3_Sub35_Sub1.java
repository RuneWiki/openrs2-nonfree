package com.jagex;

import java.awt.Point;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amg")
public class Class3_Sub35_Sub1 extends Class3_Sub35 {

	@OriginalMember(owner = "client!amg", name = "kq", descriptor = "I")
	public static int anInt2644;

	@OriginalMember(owner = "client!amg", name = "l", descriptor = "I")
	static final int anInt2647 = 100;

	@OriginalMember(owner = "client!amg", name = "h", descriptor = "Lclient!nr;")
	static Class354 aClass354_1 = new Class354(64, Class360.aClass360_2);

	@OriginalMember(owner = "client!amg", name = "s", descriptor = "Lclient!wk;")
	final Class553 aClass553_39 = new Class553();

	@OriginalMember(owner = "client!amg", name = "u", descriptor = "I")
	int anInt2646 = 0;

	@OriginalMember(owner = "client!amg", name = "x", descriptor = "I")
	final int anInt2645;

	@OriginalMember(owner = "client!amg", name = "<init>", descriptor = "(I)V", line = 16)
	Class3_Sub35_Sub1(@OriginalArg(0) int arg0) {
		this.anInt2645 = arg0 * -621828841;
	}

	@OriginalMember(owner = "client!amg", name = "p", descriptor = "(IB)V", line = 20)
	public void method18842(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!amg", name = "y", descriptor = "(I)V", line = 20)
	public void method18845() {
	}

	@OriginalMember(owner = "client!amg", name = "b", descriptor = "(I)V", line = 20)
	public void method18850() {
	}

	@OriginalMember(owner = "client!amg", name = "u", descriptor = "(I)V", line = 20)
	public void method18852() {
	}

	@OriginalMember(owner = "client!amg", name = "a", descriptor = "(B)I", line = 23)
	synchronized int method18843() {
		return this.anInt2646 * 252974905;
	}

	@OriginalMember(owner = "client!amg", name = "c", descriptor = "()I", line = 23)
	synchronized int method18851() {
		return this.anInt2646 * 252974905;
	}

	@OriginalMember(owner = "client!amg", name = "j", descriptor = "()I", line = 23)
	synchronized int method18853() {
		return this.anInt2646 * 252974905;
	}

	@OriginalMember(owner = "client!amg", name = "z", descriptor = "()I", line = 23)
	synchronized int method18861() {
		return this.anInt2646 * 252974905;
	}

	@OriginalMember(owner = "client!amg", name = "g", descriptor = "(ID)Lclient!agy;", line = 27)
	Class3_Sub39 method18844(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(9) long local9 = (long) (this.anInt2645 * 1067180711 << 0 | arg0);
		@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) aClass354_1.method26608(local9);
		if (local16 == null) {
			local16 = new Class3_Sub39(new short[this.anInt2645 * 1067180711][arg0], arg1);
		} else {
			local16.aDouble1 = arg1;
			aClass354_1.method26617(local9);
		}
		return local16;
	}

	@OriginalMember(owner = "client!amg", name = "n", descriptor = "(ID)Lclient!agy;", line = 27)
	Class3_Sub39 method18854(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(9) long local9 = (long) (this.anInt2645 * 1067180711 << 0 | arg0);
		@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) aClass354_1.method26608(local9);
		if (local16 == null) {
			local16 = new Class3_Sub39(new short[this.anInt2645 * 1067180711][arg0], arg1);
		} else {
			local16.aDouble1 = arg1;
			aClass354_1.method26617(local9);
		}
		return local16;
	}

	@OriginalMember(owner = "client!amg", name = "i", descriptor = "(ID)Lclient!agy;", line = 27)
	Class3_Sub39 method18855(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(9) long local9 = (long) (this.anInt2645 * 1067180711 << 0 | arg0);
		@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) aClass354_1.method26608(local9);
		if (local16 == null) {
			local16 = new Class3_Sub39(new short[this.anInt2645 * 1067180711][arg0], arg1);
		} else {
			local16.aDouble1 = arg1;
			aClass354_1.method26617(local9);
		}
		return local16;
	}

	@OriginalMember(owner = "client!amg", name = "f", descriptor = "(ID)Lclient!agy;", line = 27)
	Class3_Sub39 method18856(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(9) long local9 = (long) (this.anInt2645 * 1067180711 << 0 | arg0);
		@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) aClass354_1.method26608(local9);
		if (local16 == null) {
			local16 = new Class3_Sub39(new short[this.anInt2645 * 1067180711][arg0], arg1);
		} else {
			local16.aDouble1 = arg1;
			aClass354_1.method26617(local9);
		}
		return local16;
	}

	@OriginalMember(owner = "client!amg", name = "k", descriptor = "(Lclient!agy;)V", line = 38)
	synchronized void method18841(@OriginalArg(0) Class3_Sub39 arg0) {
		while (this.anInt2646 * 252974905 >= 100) {
			this.aClass553_39.method32718();
			this.anInt2646 -= 1766696713;
		}
		this.aClass553_39.method32702(arg0);
		this.anInt2646 += 1766696713;
	}

	@OriginalMember(owner = "client!amg", name = "af", descriptor = "(Lclient!agy;)V", line = 38)
	synchronized void method18846(@OriginalArg(0) Class3_Sub39 arg0) {
		while (this.anInt2646 * 252974905 >= 100) {
			this.aClass553_39.method32718();
			this.anInt2646 -= 1766696713;
		}
		this.aClass553_39.method32702(arg0);
		this.anInt2646 += 1766696713;
	}

	@OriginalMember(owner = "client!amg", name = "aa", descriptor = "(Lclient!agy;)V", line = 38)
	synchronized void method18849(@OriginalArg(0) Class3_Sub39 arg0) {
		while (this.anInt2646 * 252974905 >= 100) {
			this.aClass553_39.method32718();
			this.anInt2646 -= 1766696713;
		}
		this.aClass553_39.method32702(arg0);
		this.anInt2646 += 1766696713;
	}

	@OriginalMember(owner = "client!amg", name = "l", descriptor = "(Lclient!agy;B)V", line = 38)
	synchronized void method18857(@OriginalArg(0) Class3_Sub39 arg0) {
		while (this.anInt2646 * 252974905 >= 100) {
			this.aClass553_39.method32718();
			this.anInt2646 -= 1766696713;
		}
		this.aClass553_39.method32702(arg0);
		this.anInt2646 += 1766696713;
	}

	@OriginalMember(owner = "client!amg", name = "at", descriptor = "(Lclient!agy;)V", line = 38)
	synchronized void method18858(@OriginalArg(0) Class3_Sub39 arg0) {
		while (this.anInt2646 * 252974905 >= 100) {
			this.aClass553_39.method32718();
			this.anInt2646 -= 1766696713;
		}
		this.aClass553_39.method32702(arg0);
		this.anInt2646 += 1766696713;
	}

	@OriginalMember(owner = "client!amg", name = "ak", descriptor = "(Lclient!agy;)V", line = 38)
	synchronized void method18860(@OriginalArg(0) Class3_Sub39 arg0) {
		while (this.anInt2646 * 252974905 >= 100) {
			this.aClass553_39.method32718();
			this.anInt2646 -= 1766696713;
		}
		this.aClass553_39.method32702(arg0);
		this.anInt2646 += 1766696713;
	}

	@OriginalMember(owner = "client!amg", name = "h", descriptor = "(B)D", line = 47)
	synchronized double method18859() {
		if (this.anInt2646 * 252974905 < 1) {
			return -1.0D;
		} else {
			@Pc(13) Class3_Sub39 local13 = (Class3_Sub39) this.aClass553_39.method32768();
			return local13 == null ? -1.0D : local13.aDouble1 - (double) ((float) local13.aShortArrayArray3[0].length / (float) Class388.anInt4752);
		}
	}

	@OriginalMember(owner = "client!amg", name = "ah", descriptor = "()D", line = 47)
	synchronized double method18862() {
		if (this.anInt2646 * 252974905 < 1) {
			return -1.0D;
		} else {
			@Pc(13) Class3_Sub39 local13 = (Class3_Sub39) this.aClass553_39.method32768();
			return local13 == null ? -1.0D : local13.aDouble1 - (double) ((float) local13.aShortArrayArray3[0].length / (float) Class388.anInt4752);
		}
	}

	@OriginalMember(owner = "client!amg", name = "x", descriptor = "(B)V", line = 53)
	synchronized void method18863() {
	}

	@OriginalMember(owner = "client!amg", name = "aj", descriptor = "()V", line = 53)
	synchronized void method18864() {
	}

	@OriginalMember(owner = "client!amg", name = "an", descriptor = "()V", line = 53)
	synchronized void method18866() {
	}

	@OriginalMember(owner = "client!amg", name = "s", descriptor = "(ZI)V", line = 54)
	synchronized void method18848(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!amg", name = "as", descriptor = "(Z)V", line = 54)
	synchronized void method18865() {
	}

	@OriginalMember(owner = "client!amg", name = "h", descriptor = "(B)V", line = 69)
	static void method18867() {
		@Pc(2) Queue local2 = Class516.aQueue4;
		synchronized (Class516.aQueue4) {
			@Pc(9) Point local9;
			if (Class106.aCanvas6.isShowing()) {
				local9 = Class106.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class3_Sub22_Sub2 local16 = (Class3_Sub22_Sub2) Class516.aQueue4.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class106.aCanvas6.isShowing() && Canvas_Sub1.aBoolean481) {
						local16.method19875(local9);
						if (!local16.method19873() && local16.method19854() < Class128.anInt3317 * 2037417253 && local16.method19867() < Class575.anInt5428 * 1261116487 && local16.method19854() >= 0 && local16.method19867() >= 0) {
							@Pc(67) int local67 = local16.method19853();
							if (local16.method19853() == -1) {
								Class516.aClass56_Sub1_1.method12576(local16);
							} else if (Class203.method24168(local67)) {
								Class516.aClass56_Sub1_1.method11925(local16);
							}
						}
					} else {
						local16.method19859();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!amg", name = "h", descriptor = "(I)V", line = 84)
	public static void method18870() {
		@Pc(3) int local3 = client.aClass370_1.method26943();
		@Pc(7) int local7 = client.aClass370_1.method27062();
		Class72_Sub1.aBooleanArrayArray11 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!amg", name = "b", descriptor = "(II)V", line = 113)
	public static void method18873(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(6, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amg", name = "bx", descriptor = "(Lclient!vs;I)V", line = 4337)
	static final void method18847(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class189.method23985(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!amg", name = "ma", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6274)
	static final void method18868(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		@Pc(18) int[] local18 = Class201.method24159(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray22 = Class484.method29109(local13, arg2);
		arg0.anIntArray363 = local18;
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!amg", name = "aai", descriptor = "(Lclient!vs;I)V", line = 8766)
	static final void method18869(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 - local23;
	}

	@OriginalMember(owner = "client!amg", name = "anx", descriptor = "(Lclient!vs;B)V", line = 11375)
	static final void method18871(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub33_4, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!amg", name = "asi", descriptor = "(Lclient!vs;B)V", line = 12262)
	static final void method18872(@OriginalArg(0) Class536 arg0) {
		@Pc(1) boolean local1 = false;
		if (client.aBoolean565) {
			try {
				@Pc(43) Object local43 = Class300.aClass300_13.method25650(new Object[] { Class357.anInt4639 * 119438137, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte77 == 1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] });
				if (local43 != null) {
					local1 = (Boolean) local43;
				}
			} catch (@Pc(51) Throwable local51) {
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local1 ? 1 : 0;
	}
}
