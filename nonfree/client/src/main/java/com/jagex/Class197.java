package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public class Class197 {

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	public static final int anInt3686 = 1700;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public static final int anInt3687 = 125000;

	@OriginalMember(owner = "client!gh", name = "ad", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray12;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 7)
	Class197() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "(CI)C", line = 72)
	static char method24123(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "ng", descriptor = "(Lclient!vs;I)V", line = 6462)
	static final void method24124(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class10.method716(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "anh", descriptor = "(Lclient!vs;I)V", line = 11416)
	static final void method24121(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
	}

	@OriginalMember(owner = "client!gh", name = "anr", descriptor = "(Lclient!vs;I)V", line = 11478)
	static final void method24122(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 > 255 || local12 < 0) {
			local12 = 0;
		}
		if (local12 != Class510.aClass3_Sub45_37.aClass60_Sub19_1.method13635()) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub19_1, local12);
			Class26_Sub1_Sub1_Sub1.method16728();
			client.aBoolean573 = false;
		}
	}
}
