package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aef")
public class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!aef", name = "ii", descriptor = "Ljava/util/Map;")
	public static Map aMap5;

	@OriginalMember(owner = "client!aef", name = "ko", descriptor = "I")
	static int anInt492;

	@OriginalMember(owner = "client!aef", name = "v", descriptor = "Lclient!pw;")
	Class478 aClass478_16;

	@OriginalMember(owner = "client!aef", name = "l", descriptor = "Lclient!pw;")
	Class478 aClass478_15;

	@OriginalMember(owner = "client!aef", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;)V", line = 11)
	public Class87_Sub1(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1) {
		this.aClass478_16 = arg0;
		this.aClass478_15 = arg1;
	}

	@OriginalMember(owner = "client!aef", name = "g", descriptor = "(Lclient!vi;ILclient!vy;FIIZ)Z", line = 17)
	@Override
	public boolean method4228(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class609 arg2, @OriginalArg(3) float arg3) {
		@Pc(1) boolean local1 = true;
		if (arg0 == Class596.aClass596_2) {
			if (this.aClass478_15.method29749(arg1)) {
				local1 = this.aClass478_15.method29730(arg1);
			}
			return local1 & this.aClass478_16.method29730(arg1);
		} else if (arg0 == Class596.aClass596_1) {
			return this.aClass478_16.method29730(arg1);
		} else if (Class596.aClass596_3 == arg0) {
			return this.aClass478_15.method29730(arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aef", name = "v", descriptor = "(Lclient!vi;ILclient!vy;FIIZI)Z", line = 17)
	@Override
	public boolean method4231(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class609 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		if (arg0 == Class596.aClass596_2) {
			if (this.aClass478_15.method29749(arg1)) {
				local1 = this.aClass478_15.method29730(arg1);
			}
			return local1 & this.aClass478_16.method29730(arg1);
		} else if (arg0 == Class596.aClass596_1) {
			return this.aClass478_16.method29730(arg1);
		} else if (Class596.aClass596_3 == arg0) {
			return this.aClass478_15.method29730(arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aef", name = "z", descriptor = "(Lclient!vi;ILclient!vy;FIIZ)Z", line = 17)
	@Override
	public boolean method4233(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class609 arg2, @OriginalArg(3) float arg3) {
		@Pc(1) boolean local1 = true;
		if (arg0 == Class596.aClass596_2) {
			if (this.aClass478_15.method29749(arg1)) {
				local1 = this.aClass478_15.method29730(arg1);
			}
			return local1 & this.aClass478_16.method29730(arg1);
		} else if (arg0 == Class596.aClass596_1) {
			return this.aClass478_16.method29730(arg1);
		} else if (Class596.aClass596_3 == arg0) {
			return this.aClass478_15.method29730(arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aef", name = "p", descriptor = "(Lclient!anb;B)V", line = 26)
	public static void method4258(@OriginalArg(0) Class35_Sub2 arg0) {
		Class474.aClass35_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!aef", name = "c", descriptor = "(Lclient!vi;II)[B", line = 32)
	@Override
	byte[] method4255(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1) {
		if ((arg0 == Class596.aClass596_1 || arg0 == Class596.aClass596_2) && this.aClass478_16.method29749(arg1)) {
			return this.aClass478_16.method29745(arg1);
		} else if (arg0 == Class596.aClass596_3 && this.aClass478_15.method29749(arg1)) {
			return this.aClass478_15.method29745(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aef", name = "j", descriptor = "(Lclient!vi;I)[B", line = 32)
	@Override
	byte[] method4256(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1) {
		if ((arg0 == Class596.aClass596_1 || arg0 == Class596.aClass596_2) && this.aClass478_16.method29749(arg1)) {
			return this.aClass478_16.method29745(arg1);
		} else if (arg0 == Class596.aClass596_3 && this.aClass478_15.method29749(arg1)) {
			return this.aClass478_15.method29745(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aef", name = "i", descriptor = "(Lclient!vi;I)[B", line = 32)
	@Override
	byte[] method4257(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1) {
		if ((arg0 == Class596.aClass596_1 || arg0 == Class596.aClass596_2) && this.aClass478_16.method29749(arg1)) {
			return this.aClass478_16.method29745(arg1);
		} else if (arg0 == Class596.aClass596_3 && this.aClass478_15.method29749(arg1)) {
			return this.aClass478_15.method29745(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aef", name = "kr", descriptor = "(Lclient!yf;B)V", line = 6397)
	static final void method4259(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class98.method7804(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aef", name = "azp", descriptor = "(Lclient!yf;I)V", line = 13807)
	static final void method4260(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class205.aClass299_1.method27072(local12 != 0);
	}
}
