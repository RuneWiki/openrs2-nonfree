package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public class Class323 {

	@OriginalMember(owner = "client!ii", name = "gb", descriptor = "Lclient!pw;")
	public static Class478 aClass478_96;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([I[S)V", line = 7)
	public Class323(@OriginalArg(0) int[] arg0, @OriginalArg(1) short[] arg1) {
		this.anIntArray433 = arg0;
		this.aShortArray113 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!iw;)V", line = 12)
	public Class323(@OriginalArg(0) Class333 arg0) {
		this.anIntArray433 = new int[8];
		this.aShortArray113 = new short[8];
		@Pc(11) int local11 = 0;
		if (arg0.anIntArray439 != null && arg0.aShortArray121 != null) {
			local11 = arg0.anIntArray439.length;
			System.arraycopy(arg0.anIntArray439, 0, this.anIntArray433, 0, local11);
			System.arraycopy(arg0.aShortArray121, 0, this.aShortArray113, 0, local11);
		}
		for (@Pc(40) int local40 = local11; local40 < 8; local40++) {
			this.anIntArray433[local40] = -1;
			this.aShortArray113[local40] = -1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "(I)Z", line = 56)
	static boolean method27471() {
		return Class590.aClass548_3 != null;
	}

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "(I)V", line = 249)
	public static void method27472() {
		if (Class354.aClass322Array1 == null) {
			Class354.aClass322Array1 = Class322.method27465();
			Class80.aClass322_4 = Class354.aClass322Array1[0];
			Class354.aLong260 = Class280.method26667() * -3214781987892434315L;
		}
		if (Class307.aClass327_1 == null) {
			Class125.method12682();
		}
		@Pc(20) Class322 local20 = Class80.aClass322_4;
		@Pc(23) int local23 = Class656.method33034();
		if (local20 == Class80.aClass322_4) {
			Class304.aString192 = Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3);
			Class192.aString165 = Class304.aString192;
			if (Class80.aClass322_4.aBoolean699) {
				Class238.anInt3781 = (Class80.aClass322_4.anInt4078 * 255476555 + (Class80.aClass322_4.anInt4079 * 1646981573 - Class80.aClass322_4.anInt4078 * 255476555) * local23 / 100) * 310636191;
			}
			if (Class80.aClass322_4.aBoolean698) {
				Class192.aString165 = Class192.aString165 + " - " + Class238.anInt3781 * 664251743 + "%";
			}
		} else if (Class80.aClass322_4 == Class322.aClass322_20) {
			Class307.aClass327_1 = null;
			Class668.method33179(15);
			if (Class354.aBoolean719) {
				Class354.aBoolean719 = false;
				Class96_Sub5.method7143(Class77_Sub22.aString48, Class117.aString44, "", false);
			}
		} else {
			Class304.aString192 = local20.aClass44_177.method713(Class128.aClass667_3);
			Class192.aString165 = Class304.aString192;
			if (Class80.aClass322_4.aBoolean698) {
				Class192.aString165 = Class192.aString165 + " - " + local20.anInt4079 * 1646981573 + "%";
			}
			Class238.anInt3781 = local20.anInt4079 * 2000703323;
			if (Class80.aClass322_4.aBoolean699 || local20.aBoolean699) {
				Class354.aLong260 = Class280.method26667() * -3214781987892434315L;
			}
		}
		if (Class307.aClass327_1 == null) {
			return;
		}
		Class307.aClass327_1.method27554(Class354.aLong260 * -8730536087753452067L, Class304.aString192, Class192.aString165, Class238.anInt3781 * 664251743, Class80.aClass322_4);
		if (Class354.anInterface32Array1 == null) {
			return;
		}
		for (@Pc(161) int local161 = Class354.anInt4498 * 1101456325 + 1; local161 < Class354.anInterface32Array1.length; local161++) {
			if (Class354.anInterface32Array1[local161].method27491() >= 100 && Class354.anInt4498 * 1101456325 == local161 - 1 && client.anInt3390 * -1850530127 != 8 && Class307.aClass327_1.method27547()) {
				try {
					Class354.anInterface32Array1[local161].method27482();
				} catch (@Pc(195) Exception local195) {
					Class354.anInterface32Array1 = null;
					break;
				}
				Class307.aClass327_1.method27551(Class354.anInterface32Array1[local161]);
				Class354.anInt4498 += -1048534259;
				if (Class354.anInt4498 * 1101456325 >= Class354.anInterface32Array1.length - 1 && Class354.anInterface32Array1.length > 1) {
					Class354.anInt4498 = (Class354.aClass66_1.method950() ? 0 : -1) * -1048534259;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "al", descriptor = "(Lclient!yf;I)V", line = 4435)
	static final void method27473(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		if (arg0.anIntArray536[arg0.anInt5784 * 2088438307] > arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!ii", name = "fq", descriptor = "(Lclient!yf;I)V", line = 5403)
	static final void method27474(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class566.method31374(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ii", name = "ajs", descriptor = "(Lclient!yf;I)V", line = 11061)
	static final void method27475(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class569.method31421();
	}
}
