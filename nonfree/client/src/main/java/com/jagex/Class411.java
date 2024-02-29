package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mz")
public class Class411 implements Interface44 {

	@OriginalMember(owner = "client!mz", name = "c", descriptor = "Lclient!er;")
	Class232 aClass232_80 = new Class232(64);

	@OriginalMember(owner = "client!mz", name = "p", descriptor = "Lclient!pw;")
	Class478 aClass478_115;

	@OriginalMember(owner = "client!mz", name = "<init>", descriptor = "(Lclient!pw;)V", line = 11)
	public Class411(@OriginalArg(0) Class478 arg0) {
		this.aClass478_115 = arg0;
	}

	@OriginalMember(owner = "client!mz", name = "c", descriptor = "(I)Lclient!mb;", line = 16)
	@Override
	public Class394 method28575(@OriginalArg(0) int arg0) {
		@Pc(6) Class394 local6 = (Class394) this.aClass232_80.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_115.method29725(0, arg0);
		local6 = new Class394();
		if (local18 != null) {
			local6.method28393(new Class77_Sub39(local18), arg0);
		}
		this.aClass232_80.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mz", name = "p", descriptor = "(II)Lclient!mb;", line = 16)
	@Override
	public Class394 method28576(@OriginalArg(0) int arg0) {
		@Pc(6) Class394 local6 = (Class394) this.aClass232_80.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_115.method29725(0, arg0);
		local6 = new Class394();
		if (local18 != null) {
			local6.method28393(new Class77_Sub39(local18), arg0);
		}
		this.aClass232_80.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mz", name = "c", descriptor = "(II)I", line = 28)
	public static int method28577(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 & 0x33333333) + (local9 >>> 2 & 0x33333333);
		@Pc(27) int local27 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!mz", name = "ay", descriptor = "(Lclient!yf;ZZI)V", line = 4560)
	static final void method28578(@OriginalArg(0) Class665 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(7) int local7 = arg0.anIntArray535[arg0.anInt5786 * 662605117];
		@Pc(20) int local20 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local20 < 0 || local20 >= arg0.anIntArray534[local7]) {
			throw new RuntimeException();
		} else if (!arg1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.anIntArrayArray64[local7][local20];
		} else if (arg2) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.anIntArrayArray64[local7][local20];
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local20;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local20;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.anIntArrayArray64[local7][local20];
		}
	}

	@OriginalMember(owner = "client!mz", name = "kk", descriptor = "(Lclient!yf;B)V", line = 6486)
	static final void method28579(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class130.method12485(local11, arg0);
	}
}
