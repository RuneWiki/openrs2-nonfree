package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public abstract class Class24 {

	@OriginalMember(owner = "client!fc", name = "dd", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Lclient!gz;")
	static final Interface16 anInterface16_3 = new Class175();

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	protected int anInt673 = -1845711215;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljava/lang/String;")
	String aString38;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	int anInt672;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!gq;")
	Class206 aClass206_5;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
	int anInt671;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!gq;")
	Class206 aClass206_6;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[Lclient!fk;")
	Class25[] aClass25Array3;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "(IB)Lclient!gd;", line = 17)
	public static Class194 method6669(@OriginalArg(0) int arg0) {
		if (Class194.aClass194_5.anInt3684 * 2107428413 == arg0) {
			return Class194.aClass194_5;
		} else if (Class194.aClass194_2.anInt3684 * 2107428413 == arg0) {
			return Class194.aClass194_2;
		} else if (Class194.aClass194_4.anInt3684 * 2107428413 == arg0) {
			return Class194.aClass194_4;
		} else if (Class194.aClass194_3.anInt3684 * 2107428413 == arg0) {
			return Class194.aClass194_3;
		} else if (Class194.aClass194_7.anInt3684 * 2107428413 == arg0) {
			return Class194.aClass194_7;
		} else if (arg0 == Class194.aClass194_6.anInt3684 * 2107428413) {
			return Class194.aClass194_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!abv;Lclient!fi;)V", line = 24)
	Class24(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class173 arg1) {
		this.aString38 = arg1.aString166;
		this.anInt672 = arg1.aClass181Array1.length * 763957879;
		this.aClass206_5 = new Class206(this.anInt672 * -782080185, anInterface16_3);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.anInt672 * -782080185; local27++) {
			this.aClass206_5.method24193(local27, arg1.aClass181Array1[local27].aString175, this.method6563(arg1.aClass181Array1[local27]));
		}
		this.anInt671 = arg1.aClass181Array2.length * 1287668921;
		this.aClass206_6 = new Class206(this.anInt671 * 357204361, anInterface16_3);
		for (local27 = 0; local27 < this.anInt671 * 357204361; local27++) {
			this.aClass206_6.method24193(local27, arg1.aClass181Array2[local27].aString175, this.method6563(arg1.aClass181Array2[local27]));
		}
		this.aClass25Array3 = new Class25[arg1.aClass170Array1.length];
		for (local27 = 0; local27 < arg1.aClass170Array1.length; local27++) {
			this.aClass25Array3[local27] = this.method6582(arg0, arg1.aClass170Array1[local27]);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 45)
	static void method6665() {
		Class338.aClass448_1 = Class448.aClass448_2;
		Class338.aClass563_1 = Class563.aClass563_4;
		Class338.aClass550_1 = Class550.aClass550_12;
		Class13_Sub13.aClass555_1 = Class555.aClass555_7;
		Class415.aClass547_1 = Class547.aClass547_6;
		Class338.aClass564_1 = Class564.aClass564_5;
		Class603.aString246 = null;
	}

	@OriginalMember(owner = "client!fc", name = "ad", descriptor = "()Ljava/lang/String;", line = 47)
	public String method6559() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(I)Ljava/lang/String;", line = 47)
	public String method6623() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "(Ljava/lang/String;I)Lclient!fk;", line = 54)
	public Class25 method6555(@OriginalArg(0) String arg0) throws Exception_Sub1_Sub2 {
		@Pc(2) Class25[] local2 = this.aClass25Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class25 local12 = local2[local4];
			@Pc(16) String local16 = local12.method6449();
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method6418()) {
					throw new Exception_Sub1_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub1_Sub2(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "ac", descriptor = "(Ljava/lang/String;)Lclient!fk;", line = 54)
	public Class25 method6601(@OriginalArg(0) String arg0) throws Exception_Sub1_Sub2 {
		@Pc(2) Class25[] local2 = this.aClass25Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class25 local12 = local2[local4];
			@Pc(16) String local16 = local12.method6449();
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method6418()) {
					throw new Exception_Sub1_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub1_Sub2(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "(I)I", line = 70)
	public final int method6556() {
		return this.aClass25Array3.length;
	}

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "(II)Lclient!fk;", line = 74)
	public final Class25 method6549(@OriginalArg(0) int arg0) {
		return this.aClass25Array3[arg0];
	}

	@OriginalMember(owner = "client!fc", name = "bw", descriptor = "(I)Lclient!fk;", line = 74)
	public final Class25 method6602(@OriginalArg(0) int arg0) {
		return this.aClass25Array3[arg0];
	}

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "(Lclient!fk;B)I", line = 78)
	public int method6592(@OriginalArg(0) Class25 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass25Array3.length; local1++) {
			if (arg0 == this.aClass25Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "bp", descriptor = "(Lclient!fk;)I", line = 78)
	public int method6603(@OriginalArg(0) Class25 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass25Array3.length; local1++) {
			if (arg0 == this.aClass25Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "bd", descriptor = "(Lclient!fk;)I", line = 78)
	public int method6604(@OriginalArg(0) Class25 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass25Array3.length; local1++) {
			if (arg0 == this.aClass25Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!fk;", line = 86)
	public Class25 method6599() {
		@Pc(2) Class25[] local2 = this.aClass25Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class25 local12 = local2[local4];
			if (local12.method6418()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "bm", descriptor = "()Lclient!fk;", line = 86)
	public Class25 method6606() {
		@Pc(2) Class25[] local2 = this.aClass25Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class25 local12 = local2[local4];
			if (local12.method6418()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "bs", descriptor = "()Lclient!fk;", line = 86)
	public Class25 method6656() {
		@Pc(2) Class25[] local2 = this.aClass25Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class25 local12 = local2[local4];
			if (local12.method6418()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "(I)Lclient!fk;", line = 100)
	public final Class25 method6561() {
		return this.anInt673 * 1375415695 >= 0 ? this.aClass25Array3[this.anInt673 * 1375415695] : null;
	}

	@OriginalMember(owner = "client!fc", name = "bf", descriptor = "()Lclient!fk;", line = 100)
	public final Class25 method6607() {
		return this.anInt673 * 1375415695 >= 0 ? this.aClass25Array3[this.anInt673 * 1375415695] : null;
	}

	@OriginalMember(owner = "client!fc", name = "bt", descriptor = "()I", line = 104)
	public final int method6608() {
		return this.anInt673 * 1375415695;
	}

	@OriginalMember(owner = "client!fc", name = "bg", descriptor = "()I", line = 104)
	public final int method6610() {
		return this.anInt673 * 1375415695;
	}

	@OriginalMember(owner = "client!fc", name = "br", descriptor = "()I", line = 104)
	public final int method6611() {
		return this.anInt673 * 1375415695;
	}

	@OriginalMember(owner = "client!fc", name = "bb", descriptor = "()I", line = 104)
	public final int method6612() {
		return this.anInt673 * 1375415695;
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)I", line = 104)
	public final int method6628() {
		return this.anInt673 * 1375415695;
	}

	@OriginalMember(owner = "client!fc", name = "bk", descriptor = "()I", line = 104)
	public final int method6638() {
		return this.anInt673 * 1375415695;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(Lclient!alr;FI)V", line = 110)
	public final void method6564(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6419(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "bi", descriptor = "(Lclient!alr;F)V", line = 110)
	public final void method6615(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6419(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ba", descriptor = "(Lclient!alr;F)V", line = 110)
	public final void method6617(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6419(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "bu", descriptor = "(Lclient!alr;F)V", line = 110)
	public final void method6636(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6419(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "(Lclient!alr;FFI)V", line = 114)
	public final void method6588(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6420(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(Lclient!alr;FFFI)V", line = 118)
	public final void method6566(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6421(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "bo", descriptor = "(Lclient!alr;FFF)V", line = 118)
	public final void method6618(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6421(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "(Lclient!alr;FFFFI)V", line = 122)
	public final void method6567(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6422(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "bn", descriptor = "(Lclient!alr;FFFF)V", line = 122)
	public final void method6591(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6422(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "bc", descriptor = "(Lclient!alr;FFFF)V", line = 122)
	public final void method6619(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6422(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "(Lclient!alr;Lclient!mh;B)V", line = 126)
	public final void method6570(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6421(arg0, arg1.aFloat259, arg1.aFloat260, arg1.aFloat261);
	}

	@OriginalMember(owner = "client!fc", name = "be", descriptor = "(Lclient!alr;Lclient!mh;)V", line = 126)
	public final void method6581(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6421(arg0, arg1.aFloat259, arg1.aFloat260, arg1.aFloat261);
	}

	@OriginalMember(owner = "client!fc", name = "bx", descriptor = "(Lclient!alr;Lclient!mv;)V", line = 130)
	public final void method6565(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class333 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6422(arg0, arg1.aFloat283, arg1.aFloat282, arg1.aFloat284, arg1.aFloat281);
	}

	@OriginalMember(owner = "client!fc", name = "bh", descriptor = "(Lclient!alr;Lclient!mv;)V", line = 130)
	public final void method6642(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class333 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6422(arg0, arg1.aFloat283, arg1.aFloat282, arg1.aFloat284, arg1.aFloat281);
	}

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "(Lclient!alr;Lclient!mv;B)V", line = 130)
	public final void method6659(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class333 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6422(arg0, arg1.aFloat283, arg1.aFloat282, arg1.aFloat284, arg1.aFloat281);
	}

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "(Lclient!alr;[FB)V", line = 134)
	public final void method6605(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6450(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!fc", name = "bj", descriptor = "(Lclient!alr;[F)V", line = 134)
	public final void method6624(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6450(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!fc", name = "bv", descriptor = "(Lclient!alr;[F)V", line = 134)
	public final void method6626(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6450(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!fc", name = "bq", descriptor = "(Lclient!alr;[F)V", line = 134)
	public final void method6661(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6450(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "(Lclient!alr;II)V", line = 138)
	public final void method6616(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method6567(arg0, local8, local17, local24, local33);
	}

	@OriginalMember(owner = "client!fc", name = "bz", descriptor = "(Lclient!alr;I)V", line = 138)
	public final void method6662(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method6567(arg0, local8, local17, local24, local33);
	}

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "(Lclient!alr;Lclient!mq;I)V", line = 146)
	public final void method6572(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6465(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "cm", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 146)
	public final void method6629(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6465(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ck", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 146)
	public final void method6651(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6465(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(Lclient!alr;Lclient!mq;B)V", line = 150)
	public final void method6620(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6429(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "cj", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 150)
	public final void method6630(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6429(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "cu", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 150)
	public final void method6631(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6429(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(Lclient!alr;ILclient!jl;I)V", line = 154)
	public final void method6622(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6426(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "cv", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 154)
	public final void method6632(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6426(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "cl", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 154)
	public final void method6633(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6426(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "cq", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 154)
	public final void method6634(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6426(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "cp", descriptor = "(IFFF)V", line = 158)
	public final void method6554(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "(IFFFB)V", line = 158)
	public final void method6575(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "cg", descriptor = "(IFFF)V", line = 158)
	public final void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "cc", descriptor = "(IFFF)V", line = 158)
	public final void method6637(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "cs", descriptor = "(IFFFF)V", line = 162)
	public final void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6428(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "at", descriptor = "(IFFFFI)V", line = 162)
	public final void method6576(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6428(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "ct", descriptor = "(IFFFF)V", line = 162)
	public final void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6428(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "af", descriptor = "(ILclient!mh;B)V", line = 166)
	public final void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1.aFloat259, arg1.aFloat260, arg1.aFloat261);
	}

	@OriginalMember(owner = "client!fc", name = "cb", descriptor = "(ILclient!mh;)V", line = 166)
	public final void method6579(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1.aFloat259, arg1.aFloat260, arg1.aFloat261);
	}

	@OriginalMember(owner = "client!fc", name = "cx", descriptor = "(ILclient!mh;)V", line = 166)
	public final void method6640(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1.aFloat259, arg1.aFloat260, arg1.aFloat261);
	}

	@OriginalMember(owner = "client!fc", name = "cy", descriptor = "(ILclient!mh;)V", line = 166)
	public final void method6641(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6427(arg0, arg1.aFloat259, arg1.aFloat260, arg1.aFloat261);
	}

	@OriginalMember(owner = "client!fc", name = "cz", descriptor = "(I[FI)V", line = 170)
	public final void method6643(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6461(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "ak", descriptor = "(I[FII)V", line = 170)
	public final void method6650(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6461(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "aa", descriptor = "(ILclient!mq;I)V", line = 174)
	public final void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6430(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "cn", descriptor = "(ILclient!mq;)V", line = 174)
	public final void method6644(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6430(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "co", descriptor = "(ILclient!mq;)V", line = 174)
	public final void method6645(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6430(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ah", descriptor = "(ILclient!mq;I)V", line = 178)
	public final void method6627(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6431(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "cd", descriptor = "(ILclient!mq;)V", line = 178)
	public final void method6646(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6431(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ch", descriptor = "(ILclient!mq;)V", line = 178)
	public final void method6647(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6431(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "an", descriptor = "(ILclient!mq;B)V", line = 182)
	public final void method6585(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6467(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ci", descriptor = "(ILclient!mq;)V", line = 182)
	public final void method6648(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6467(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "ca", descriptor = "(ILclient!mq;)V", line = 182)
	public final void method6649(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6467(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "cr", descriptor = "(IILclient!jl;)V", line = 186)
	public final void method6553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6433(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "ce", descriptor = "(IILclient!jl;)V", line = 186)
	public final void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6433(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "cw", descriptor = "(IILclient!jl;)V", line = 186)
	public final void method6652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6433(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "cf", descriptor = "(IILclient!jl;)V", line = 186)
	public final void method6653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6433(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "aj", descriptor = "(IILclient!jl;S)V", line = 186)
	public final void method6657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass25Array3[this.anInt673 * 1375415695].method6433(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "as", descriptor = "(Ljava/lang/String;I)Lclient!alr;", line = 190)
	public Class3_Sub19_Sub1 method6583(@OriginalArg(0) String arg0) throws Exception_Sub1_Sub1 {
		@Pc(6) Class3_Sub19_Sub1 local6 = (Class3_Sub19_Sub1) this.aClass206_5.method24195(arg0);
		if (local6 == null) {
			throw new Exception_Sub1_Sub1(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!fc", name = "dv", descriptor = "(Ljava/lang/String;)Lclient!alr;", line = 190)
	public Class3_Sub19_Sub1 method6654(@OriginalArg(0) String arg0) throws Exception_Sub1_Sub1 {
		@Pc(6) Class3_Sub19_Sub1 local6 = (Class3_Sub19_Sub1) this.aClass206_5.method24195(arg0);
		if (local6 == null) {
			throw new Exception_Sub1_Sub1(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!fc", name = "ai", descriptor = "(B)I", line = 196)
	public int method6625() {
		return this.anInt671 * 357204361;
	}

	@OriginalMember(owner = "client!fc", name = "df", descriptor = "()I", line = 196)
	public int method6655() {
		return this.anInt671 * 357204361;
	}

	@OriginalMember(owner = "client!fc", name = "aq", descriptor = "(II)Lclient!alr;", line = 200)
	public Class3_Sub19_Sub1 method6663(@OriginalArg(0) int arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_6.method24202(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "dh", descriptor = "(Ljava/lang/String;)Lclient!alr;", line = 204)
	public Class3_Sub19_Sub1 method6577(@OriginalArg(0) String arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_6.method24195(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "db", descriptor = "(Ljava/lang/String;)Lclient!alr;", line = 204)
	public Class3_Sub19_Sub1 method6578(@OriginalArg(0) String arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_6.method24195(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "av", descriptor = "(Ljava/lang/String;I)Lclient!alr;", line = 204)
	public Class3_Sub19_Sub1 method6586(@OriginalArg(0) String arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_6.method24195(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "dy", descriptor = "()I", line = 208)
	public int method6562() {
		return this.anInt672 * -782080185;
	}

	@OriginalMember(owner = "client!fc", name = "dk", descriptor = "()I", line = 208)
	public int method6569() {
		return this.anInt672 * -782080185;
	}

	@OriginalMember(owner = "client!fc", name = "ax", descriptor = "(I)I", line = 208)
	public int method6587() {
		return this.anInt672 * -782080185;
	}

	@OriginalMember(owner = "client!fc", name = "dp", descriptor = "()I", line = 208)
	public int method6658() {
		return this.anInt672 * -782080185;
	}

	@OriginalMember(owner = "client!fc", name = "dg", descriptor = "()I", line = 208)
	public int method6660() {
		return this.anInt672 * -782080185;
	}

	@OriginalMember(owner = "client!fc", name = "ds", descriptor = "(I)Lclient!alr;", line = 212)
	public Class3_Sub19_Sub1 method6558(@OriginalArg(0) int arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_5.method24202(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "az", descriptor = "(II)Lclient!alr;", line = 212)
	public Class3_Sub19_Sub1 method6571(@OriginalArg(0) int arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_5.method24202(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "dq", descriptor = "(I)Lclient!alr;", line = 212)
	public Class3_Sub19_Sub1 method6609(@OriginalArg(0) int arg0) {
		return (Class3_Sub19_Sub1) this.aClass206_5.method24202(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "dr", descriptor = "()V", line = 215)
	void method6580() {
	}

	@OriginalMember(owner = "client!fc", name = "al", descriptor = "()V", line = 215)
	void method6589() {
	}

	@OriginalMember(owner = "client!fc", name = "ds", descriptor = "(Lclient!de;IIIIB)V", line = 561)
	static final void method6670(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method17079(arg1, arg2, arg1 + arg3, arg2 + arg4);
		arg0.method17063(arg1, arg2, arg3, arg4, -16777216);
		if (Class58_Sub1.anInt1434 * 1235407417 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) Class58_Sub1.anInt1408 / (float) Class58_Sub1.anInt1407;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class381.aClass6_28 == null || Class381.aClass6_28.method16782() != local31 || Class381.aClass6_28.method16787() != local33) {
			Class58_Sub1.aClass161_9 = Class58_Sub1.aClass161_7;
			Class58_Sub1.method12399(Class58_Sub1.anInt1429, Class58_Sub1.anInt1406 + Class58_Sub1.anInt1408, Class58_Sub1.anInt1407 + Class58_Sub1.anInt1429, Class58_Sub1.anInt1406, local58, local66, local31 + local58, local33 + local66);
			Class58_Sub1.method12400(arg0, false, false, client.aBoolean590, true);
			arg0.method17028();
			Class381.aClass6_28 = arg0.method17090(local58, local66, local31, local33, true);
		}
		Class381.aClass6_28.method16783(local58, local66);
		@Pc(123) int local123 = Class463.anInt5070 * 469310261 * local31 / Class58_Sub1.anInt1407;
		@Pc(131) int local131 = local33 * -1063851471 * Class237.anInt3749 / Class58_Sub1.anInt1408;
		@Pc(141) int local141 = local58 + Class177.anInt3475 * 1948318155 * local31 / Class58_Sub1.anInt1407;
		@Pc(155) int local155 = local66 + local33 - Class408.anInt4816 * -1004030139 * local33 / Class58_Sub1.anInt1408 - local131;
		@Pc(157) int local157 = -1996554240;
		if (client.aClass543_2 == Class543.aClass543_5) {
			local157 = -1996488705;
		}
		arg0.method17050(local141, local155, local123, local131, local157, 1);
		arg0.method17068(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class3_Sub26 local183 = (Class3_Sub26) Class58_Sub1.aClass553_23.method32768(); local183 != null; local183 = (Class3_Sub26) Class58_Sub1.aClass553_23.method32709()) {
			@Pc(194) Class452 local194 = Class58_Sub1.aClass454_2.method28448(local183.anInt1304 * 1865552421);
			if (Class44_Sub1.method8406(local194)) {
				@Pc(208) Class472 local208 = (Class472) Class58_Sub1.aHashMap3.get(local183.anInt1304 * 1865552421);
				if (local208 == null) {
					local208 = (Class472) Class58_Sub1.aHashMap4.get(local194.anInt5054 * -589352987);
				}
				if (local208 != null) {
					@Pc(245) int local245;
					if (local208.anInt5118 * 250493265 > Class58_Sub1.anInt1439 * -242378493 / 2) {
						local245 = (Class58_Sub1.anInt1439 * -1676973571 - local208.anInt5118 * -548726865) / (Class58_Sub1.anInt1439 * -242378493);
					} else {
						local245 = local208.anInt5118 * -548726865 / (Class58_Sub1.anInt1439 * -242378493);
					}
					@Pc(266) int local266 = local58 + local183.anInt1303 * -582755297 * local31 / Class58_Sub1.anInt1407;
					@Pc(279) int local279 = local66 + (Class58_Sub1.anInt1408 - local183.anInt1306 * 1667122095) * local33 / Class58_Sub1.anInt1408;
					arg0.method17063(local266 - 2, local279 - 2, 4, 4, local245 << 24 | 0xFFFF00);
				}
			}
		}
		Class58_Sub1.aClass161_7.method23240(5);
	}

	@OriginalMember(owner = "client!fc", name = "aw", descriptor = "(Lclient!vs;B)V", line = 4162)
	static final void method6666(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5316 -= -43584562;
		if (arg0.aLongArray18[arg0.anInt5316 * 196643287] == arg0.aLongArray18[arg0.anInt5316 * 196643287 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!fc", name = "kg", descriptor = "(Lclient!vs;I)V", line = 5961)
	static final void method6673(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class462.method28601(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "sh", descriptor = "(Lclient!vs;B)V", line = 7477)
	static final void method6672(@OriginalArg(0) Class536 arg0) {
		Class62_Sub1.method12870(true);
	}

	@OriginalMember(owner = "client!fc", name = "aon", descriptor = "(Lclient!vs;B)V", line = 11583)
	static final void method6667(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub27_1.method13857();
	}

	@OriginalMember(owner = "client!fc", name = "atz", descriptor = "(Lclient!vs;I)V", line = 12420)
	static final void method6668(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method14599(local12);
	}

	@OriginalMember(owner = "client!fc", name = "avs", descriptor = "(Lclient!vs;I)V", line = 12767)
	static final void method6671(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 100;
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "()V")
	public abstract void method6550();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	public abstract void method6551();

	@OriginalMember(owner = "client!fc", name = "ap", descriptor = "()V")
	public abstract void method6552();

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "()V")
	public abstract void method6557();

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lclient!fk;)Z")
	public abstract boolean method6560(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(Lclient!fr;)Lclient!alr;")
	abstract Class3_Sub19_Sub1 method6563(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "()Z")
	public abstract boolean method6574();

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(Lclient!abv;Lclient!ff;)Lclient!fk;")
	abstract Class25 method6582(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class170 arg1);

	@OriginalMember(owner = "client!fc", name = "ao", descriptor = "()V")
	public abstract void method6590();

	@OriginalMember(owner = "client!fc", name = "au", descriptor = "()V")
	public abstract void method6593();

	@OriginalMember(owner = "client!fc", name = "ay", descriptor = "()V")
	public abstract void method6594();

	@OriginalMember(owner = "client!fc", name = "ag", descriptor = "()V")
	public abstract void method6595();

	@OriginalMember(owner = "client!fc", name = "am", descriptor = "()V")
	public abstract void method6596();

	@OriginalMember(owner = "client!fc", name = "ar", descriptor = "()Z")
	public abstract boolean method6597();

	@OriginalMember(owner = "client!fc", name = "ae", descriptor = "()Z")
	public abstract boolean method6598();

	@OriginalMember(owner = "client!fc", name = "aw", descriptor = "(Lclient!abv;Lclient!ff;)Lclient!fk;")
	abstract Class25 method6600(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class170 arg1);

	@OriginalMember(owner = "client!fc", name = "by", descriptor = "(Lclient!fr;)Lclient!alr;")
	abstract Class3_Sub19_Sub1 method6613(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!fc", name = "bl", descriptor = "(Lclient!fr;)Lclient!alr;")
	abstract Class3_Sub19_Sub1 method6614(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!fc", name = "dc", descriptor = "(Lclient!fk;)Z")
	public abstract boolean method6664(@OriginalArg(0) Class25 arg0);
}
