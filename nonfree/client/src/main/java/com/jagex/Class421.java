package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qy")
public class Class421 {

	@OriginalMember(owner = "client!qy", name = "p", descriptor = "I")
	public int anInt4846;

	@OriginalMember(owner = "client!qy", name = "a", descriptor = "[I")
	public int[] anIntArray435;

	@OriginalMember(owner = "client!qy", name = "g", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!qy", name = "<init>", descriptor = "(I)V", line = 11)
	public Class421(@OriginalArg(0) int arg0) {
		this.anInt4846 = arg0 * -1271181801;
		this.anIntArray435 = new int[this.anInt4846 * 721471911];
		this.anIntArray434 = new int[this.anInt4846 * 721471911];
	}

	@OriginalMember(owner = "client!qy", name = "b", descriptor = "(IIII)Z", line = 318)
	static boolean method27853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class438 local3 = client.aClass370_1.method26950();
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface43 local13 = (Interface43) local3.method28066(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class579.method33209(local13);
		}
		local13 = (Interface43) local3.method28150(arg0, arg1, arg2, client.anInterface48_1);
		if (local13 != null) {
			local5 &= Class579.method33209(local13);
		}
		local13 = (Interface43) local3.method28053(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class579.method33209(local13);
		}
		return local5;
	}

	@OriginalMember(owner = "client!qy", name = "ll", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6127)
	static final void method27847(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray17 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!qy", name = "qd", descriptor = "(Lclient!vs;I)V", line = 7098)
	static final void method27848(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class418.method27832(local16, arg0);
	}

	@OriginalMember(owner = "client!qy", name = "te", descriptor = "(Lclient!vs;I)V", line = 7709)
	static final void method27849(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class510.aClass183_1.method23577(local13, local23, local33);
	}

	@OriginalMember(owner = "client!qy", name = "xx", descriptor = "(Lclient!vs;I)V", line = 8371)
	static final void method27850(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aClass313Array1[local12].aString199;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		}
	}

	@OriginalMember(owner = "client!qy", name = "ajk", descriptor = "(Lclient!vs;B)V", line = 10637)
	static final void method27852(@OriginalArg(0) Class536 arg0) {
		Class540.method32578();
	}

	@OriginalMember(owner = "client!qy", name = "alh", descriptor = "(Lclient!vs;I)V", line = 11163)
	static final void method27851(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class592.method33351().method33765();
	}
}
