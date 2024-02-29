package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public class Class446 implements Interface4 {

	@OriginalMember(owner = "client!on", name = "w", descriptor = "J")
	static long aLong274;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_119;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	final int anInt4948;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!pw;I)V", line = 11)
	Class446(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		this.aClass478_119 = arg0;
		this.anInt4948 = arg1 * -287014609;
	}

	@OriginalMember(owner = "client!on", name = "p", descriptor = "(I)I", line = 17)
	@Override
	public int method29477() {
		return this.aClass478_119.method29733(this.anInt4948 * -1124309553) ? 100 : this.aClass478_119.method29739(this.anInt4948 * -1124309553);
	}

	@OriginalMember(owner = "client!on", name = "v", descriptor = "()I", line = 17)
	@Override
	public int method29472() {
		return this.aClass478_119.method29733(this.anInt4948 * -1124309553) ? 100 : this.aClass478_119.method29739(this.anInt4948 * -1124309553);
	}

	@OriginalMember(owner = "client!on", name = "l", descriptor = "()I", line = 17)
	@Override
	public int method29473() {
		return this.aClass478_119.method29733(this.anInt4948 * -1124309553) ? 100 : this.aClass478_119.method29739(this.anInt4948 * -1124309553);
	}

	@OriginalMember(owner = "client!on", name = "y", descriptor = "()I", line = 17)
	@Override
	public int method29474() {
		return this.aClass478_119.method29733(this.anInt4948 * -1124309553) ? 100 : this.aClass478_119.method29739(this.anInt4948 * -1124309553);
	}

	@OriginalMember(owner = "client!on", name = "x", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29478() {
		return Class29.aClass29_3;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)Lclient!abc;", line = 22)
	@Override
	public Class29 method29471() {
		return Class29.aClass29_3;
	}

	@OriginalMember(owner = "client!on", name = "w", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29476() {
		return Class29.aClass29_3;
	}

	@OriginalMember(owner = "client!on", name = "t", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29470() {
		return Class29.aClass29_3;
	}

	@OriginalMember(owner = "client!on", name = "q", descriptor = "()Lclient!abc;", line = 22)
	@Override
	public Class29 method29475() {
		return Class29.aClass29_3;
	}

	@OriginalMember(owner = "client!on", name = "as", descriptor = "(Lclient!ow;Lclient!oi;IIS)V", line = 1107)
	static void method29107(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class683.aClass442_98 == null) {
			Class683.aClass442_98 = new Class442(arg1);
		} else {
			Class683.aClass442_98.method28954(arg1);
		}
		Class683.aClass455_54.method29387(arg0);
		Class683.anInt5833 = arg2 * 1658436649;
		Class683.anInt5834 = arg3 * -1631970627;
	}

	@OriginalMember(owner = "client!on", name = "o", descriptor = "(IIII)I", line = 1577)
	static final int method29108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(8) int local8 = 128 - arg2;
		@Pc(22) int local22 = local8 * (arg0 & 0x7F) + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(36) int local36 = (arg0 & 0x380) * local8 + (arg1 & 0x380) * arg2 >> 7;
		@Pc(50) int local50 = local8 * (arg0 & 0xFC00) + (arg1 & 0xFC00) * arg2 >> 7;
		return local50 & 0xFC00 | local36 & 0x380 | local22 & 0x7F;
	}

	@OriginalMember(owner = "client!on", name = "kq", descriptor = "(Lclient!yf;I)V", line = 6320)
	static final void method29109(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		IcmpService_Sub1.method15418(local11, arg0);
	}

	@OriginalMember(owner = "client!on", name = "ne", descriptor = "(I)V", line = 12449)
	static void method29110() {
		if (Class661.aClass661_3 != client.aClass661_1) {
			Class413.aClass413_2.method28607();
		}
	}

	@OriginalMember(owner = "client!on", name = "ato", descriptor = "(Lclient!yf;I)V", line = 12856)
	static final void method29111(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class303.method27192(5, local13, local23, "");
	}
}
