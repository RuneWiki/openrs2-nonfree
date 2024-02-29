package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public class Class465 {

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	static final int anInt4977 = 32768;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	static final int anInt4978 = 0;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "Lclient!er;")
	final Class232 aClass232_85 = new Class232(64);

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_123;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_122;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!yi;Lclient!pw;Lclient!pw;)V", line = 15)
	public Class465(@OriginalArg(0) Class667 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class478 arg2) {
		this.aClass478_123 = arg1;
		this.aClass478_122 = arg2;
		if (this.aClass478_123 != null) {
			this.aClass478_123.method29752(0);
		}
		if (this.aClass478_122 != null) {
			this.aClass478_122.method29752(0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "(II)Lclient!arw;", line = 27)
	public Class77_Sub1_Sub19 method29551(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub19 local6 = (Class77_Sub1_Sub19) this.aClass232_85.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass478_122.method29725(0, arg0 & 0x7FFF);
		} else {
			local23 = this.aClass478_123.method29725(0, arg0);
		}
		local6 = new Class77_Sub1_Sub19();
		if (local23 != null) {
			local6.method22828(new Class77_Sub39(local23));
		}
		if (arg0 >= 32768) {
			local6.method22839();
		}
		this.aClass232_85.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Lclient!arw;", line = 27)
	public Class77_Sub1_Sub19 method29552(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub19 local6 = (Class77_Sub1_Sub19) this.aClass232_85.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass478_122.method29725(0, arg0 & 0x7FFF);
		} else {
			local23 = this.aClass478_123.method29725(0, arg0);
		}
		local6 = new Class77_Sub1_Sub19();
		if (local23 != null) {
			local6.method22828(new Class77_Sub39(local23));
		}
		if (arg0 >= 32768) {
			local6.method22839();
		}
		this.aClass232_85.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(CI)Z", line = 186)
	public static boolean method29553(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pi", name = "im", descriptor = "(B)V", line = 5508)
	static final void method29554() {
		for (@Pc(4) Class77_Sub1_Sub4 local4 = (Class77_Sub1_Sub4) client.aClass695_45.method36395(); local4 != null; local4 = (Class77_Sub1_Sub4) client.aClass695_45.method36406()) {
			@Pc(10) Class104_Sub1_Sub1_Sub6 local10 = local4.aClass104_Sub1_Sub1_Sub6_1;
			if (client.anInt3414 > local10.anInt3221 * 1150056077) {
				local4.method24063();
				local10.method24203();
			} else if (client.anInt3414 >= local10.anInt3224 * -1251788571) {
				local10.method24190();
				@Pc(134) Class447 local134;
				if (local10.anInt3226 * -266928339 > 0) {
					if (client.anInt3443 * -1468443459 == 3) {
						@Pc(53) Class104_Sub1_Sub1_Sub1 local53 = Class589.aClass222Array1[local10.anInt3226 * -266928339 - 1].method25755();
						if (local53 != null) {
							@Pc(60) Class447 local60 = local53.method24085().aClass447_61;
							if ((int) local60.aFloat277 >= 0 && (int) local60.aFloat277 < client.aClass517_1.method30411() * 512 && (int) local60.aFloat278 >= 0 && (int) local60.aFloat278 < client.aClass517_1.method30417() * 512) {
								local10.method24184((int) local60.aFloat277, (int) local60.aFloat278, Class277.method26658((int) local60.aFloat277, (int) local60.aFloat278, local53.aByte100) - local10.anInt3231 * 710671791, client.anInt3414);
							}
						}
					} else {
						@Pc(123) Class77_Sub6 local123 = (Class77_Sub6) client.aClass12_22.method173((long) (local10.anInt3226 * -266928339 - 1));
						if (local123 != null) {
							@Pc(130) Class104_Sub1_Sub1_Sub1_Sub1 local130 = (Class104_Sub1_Sub1_Sub1_Sub1) local123.anObject5;
							local134 = local130.method24085().aClass447_61;
							if ((int) local134.aFloat277 >= 0 && (int) local134.aFloat277 < client.aClass517_1.method30411() * 512 && (int) local134.aFloat278 >= 0 && (int) local134.aFloat278 < client.aClass517_1.method30417() * 512) {
								local10.method24184((int) local134.aFloat277, (int) local134.aFloat278, Class277.method26658((int) local134.aFloat277, (int) local134.aFloat278, local10.aByte100) - local10.anInt3231 * 710671791, client.anInt3414);
							}
						}
					}
				}
				if (local10.anInt3226 * -266928339 < 0) {
					@Pc(198) int local198 = -(local10.anInt3226 * -266928339) - 1;
					@Pc(205) Class104_Sub1_Sub1_Sub1_Sub2 local205;
					if (local198 == client.anInt3389 * -643758853) {
						local205 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3;
					} else {
						local205 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local198];
					}
					if (local205 != null) {
						local134 = local205.method24085().aClass447_61;
						if ((int) local134.aFloat277 >= 0 && (int) local134.aFloat277 < client.aClass517_1.method30411() * 512 && (int) local134.aFloat278 >= 0 && (int) local134.aFloat278 < client.aClass517_1.method30417() * 512) {
							local10.method24184((int) local134.aFloat277, (int) local134.aFloat278, Class277.method26658((int) local134.aFloat277, (int) local134.aFloat278, local10.aByte100) - local10.anInt3231 * 710671791, client.anInt3414);
						}
					}
				}
				local10.method24193(client.anInt3418 * -636695479);
				client.aClass517_1.method30435().method31148(local10, true);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "jl", descriptor = "(Lclient!alc;IZI)V", line = 6230)
	public static final void method29555(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class20.method416(arg0, arg1, true, arg2);
	}

	@OriginalMember(owner = "client!pi", name = "vm", descriptor = "(Lclient!yf;B)V", line = 8383)
	static final void method29556(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local12 >> 14 & 0x3FFF;
	}
}
