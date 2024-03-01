package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public class Class373 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString191;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt4597;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 8)
	Class373() {
	}

	@OriginalMember(owner = "client!kb", name = "ei", descriptor = "(I)V", line = 811)
	public static void method28022() {
		Class275.method26344(true);
	}

	@OriginalMember(owner = "client!kb", name = "aka", descriptor = "(Lclient!yf;B)V", line = 11703)
	static final void method28021(@OriginalArg(0) Class681 arg0) {
		Class279.method26449(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
	}

	@OriginalMember(owner = "client!kb", name = "alb", descriptor = "(Lclient!yf;I)V", line = 11872)
	static final void method28020(@OriginalArg(0) Class681 arg0) {
		@Pc(3) int local3 = Class698.anInt5951 * 1760260613;
		@Pc(7) int local7 = Class79_Sub1_Sub1.anInt255 * -1809813621;
		@Pc(9) int local9 = -1;
		if (Class4.aBoolean2) {
			@Pc(14) Class14[] local14 = Class124_Sub3.method21453();
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(24) Class14 local24 = local14[local16];
				if (local24.anInt49 * -1362482655 == local3 && local7 == local24.anInt50 * 72041005) {
					local9 = local16;
					break;
				}
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local9;
	}

	@OriginalMember(owner = "client!kb", name = "axp", descriptor = "(Lclient!yf;B)V", line = 13897)
	static final void method28023(@OriginalArg(0) Class681 arg0) {
		Class93_Sub8.method12991();
	}

	@OriginalMember(owner = "client!kb", name = "bak", descriptor = "(Lclient!yf;I)V", line = 14315)
	static final void method28024(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub2_1.method16543(local12);
	}
}
