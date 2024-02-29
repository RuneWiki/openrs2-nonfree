package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public class Class464 {

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "[Lclient!pj;")
	Class466[] aClass466Array1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!akv;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 133)
	Class464(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		arg0.anInt3089 = 1652589927;
		@Pc(8) int local8 = arg0.method22478();
		arg0.anInt3089 += local8 * 671635056;
		@Pc(26) byte[] local26 = new byte[arg0.aByteArray53.length - arg0.anInt3089 * 31645619];
		arg0.method22533(local26, 0, local26.length);
		@Pc(40) byte[] local40;
		if (arg1 == null || arg2 == null) {
			local40 = local26;
		} else {
			@Pc(46) BigInteger local46 = new BigInteger(local26);
			@Pc(51) BigInteger local51 = local46.modPow(arg1, arg2);
			local40 = local51.toByteArray();
		}
		if (local40.length != 65) {
			throw new RuntimeException();
		}
		@Pc(77) byte[] local77 = Class659.method33068(arg0.aByteArray53, 5, arg0.anInt3089 * 31645619 - local26.length - 5);
		@Pc(79) int local79;
		for (local79 = 0; local79 < 64; local79++) {
			if (local40[local79 + 1] != local77[local79]) {
				throw new RuntimeException();
			}
		}
		this.aClass466Array1 = new Class466[local8];
		for (local79 = 0; local79 < local8; local79++) {
			arg0.anInt3089 = local79 * 671635056 + 265120994;
			@Pc(117) int local117 = arg0.method22500();
			@Pc(121) int local121 = arg0.method22500();
			@Pc(125) int local125 = arg0.method22500();
			@Pc(129) int local129 = arg0.method22500();
			@Pc(132) byte[] local132 = new byte[64];
			arg0.method22533(local132, 0, 64);
			this.aClass466Array1[local79] = new Class466(local117, local125, local121, local129, local132);
		}
	}

	@OriginalMember(owner = "client!ph", name = "dj", descriptor = "(Lclient!yf;I)V", line = 5216)
	static final void method29546(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class93.method6425(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "oz", descriptor = "(Lclient!yf;I)V", line = 7237)
	static final void method29547(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class556.method31254(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "akn", descriptor = "(Lclient!yf;B)V", line = 11266)
	static final void method29548(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class343.method27794();
	}

	@OriginalMember(owner = "client!ph", name = "ns", descriptor = "(Lclient!ae;I)V", line = 12454)
	static void method29549(@OriginalArg(0) Class82 arg0) {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_112, arg0.aClass16_1);
		arg0.method2004(local5);
		client.aBoolean630 = true;
	}

	@OriginalMember(owner = "client!ph", name = "azv", descriptor = "(Lclient!yf;I)V", line = 13799)
	static final void method29550(@OriginalArg(0) Class665 arg0) {
		if (Class205.aClass299_1.method27077() > 0) {
			@Pc(17) String local17 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
			@Pc(22) String local22 = Class205.aClass299_1.method27096(local17);
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local22;
		}
	}
}
