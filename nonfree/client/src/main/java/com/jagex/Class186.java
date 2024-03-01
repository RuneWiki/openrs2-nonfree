package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public class Class186 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "[Lclient!fo;")
	Class178[] aClass178Array7;

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "[Lclient!fo;")
	public Class178[] aClass178Array8;

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "Z")
	public boolean aBoolean657;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Z[Lclient!fo;)V", line = 8)
	Class186(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class178[] arg1) {
		this.aClass178Array8 = arg1;
		this.aBoolean657 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "()[Lclient!fo;", line = 14)
	public Class178[] method23914() {
		return this.aClass178Array7 == null ? this.aClass178Array8 : this.aClass178Array7;
	}

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "()[Lclient!fo;", line = 14)
	public Class178[] method23915() {
		return this.aClass178Array7 == null ? this.aClass178Array8 : this.aClass178Array7;
	}

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "(B)[Lclient!fo;", line = 14)
	public Class178[] method23919() {
		return this.aClass178Array7 == null ? this.aClass178Array8 : this.aClass178Array7;
	}

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "()[Lclient!fo;", line = 14)
	public Class178[] method23920() {
		return this.aClass178Array7 == null ? this.aClass178Array8 : this.aClass178Array7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)[Lclient!fo;", line = 18)
	public Class178[] method23916() {
		if (this.aClass178Array7 == null) {
			@Pc(6) int local6 = this.aClass178Array8.length;
			this.aClass178Array7 = new Class178[local6];
			System.arraycopy(this.aClass178Array8, 0, this.aClass178Array7, 0, this.aClass178Array8.length);
		}
		return this.aClass178Array7;
	}

	@OriginalMember(owner = "client!fw", name = "s", descriptor = "()[Lclient!fo;", line = 18)
	public Class178[] method23921() {
		if (this.aClass178Array7 == null) {
			@Pc(6) int local6 = this.aClass178Array8.length;
			this.aClass178Array7 = new Class178[local6];
			System.arraycopy(this.aClass178Array8, 0, this.aClass178Array7, 0, this.aClass178Array8.length);
		}
		return this.aClass178Array7;
	}

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "(II)Lclient!fo;", line = 27)
	public Class178 method23917(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass178Array8[0].anInt3570 * 954808515 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass178Array8[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "(I)Lclient!fo;", line = 27)
	public Class178 method23918(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass178Array8[0].anInt3570 * 954808515 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass178Array8[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "(I)Lclient!fo;", line = 27)
	public Class178 method23922(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass178Array8[0].anInt3570 * 954808515 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass178Array8[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)Lclient!fo;", line = 27)
	public Class178 method23923(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass178Array8[0].anInt3570 * 954808515 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass178Array8[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!and;II)V", line = 90)
	static final void method23925(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		Class52.anInt1129 = 0;
		Class605.method33537(arg0);
		Class525.method32380(arg0);
		if (arg1 != arg0.anInt2803 * 62066237) {
			throw new RuntimeException(arg0.anInt2803 * 62066237 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!fw", name = "id", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5522)
	static final void method23927(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.aString168 = client.aClass313Array1[local12].aString202;
		}
	}

	@OriginalMember(owner = "client!fw", name = "jp", descriptor = "(IIIB)I", line = 6012)
	public static final int method23926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (client.aClass370_1.method26950() == null) {
			return 0;
		}
		@Pc(9) int local9 = arg0 >> 9;
		@Pc(13) int local13 = arg1 >> 9;
		if (local9 < 0 || local13 < 0 || local9 > client.aClass370_1.method26943() - 1 || local13 > client.aClass370_1.method27062() - 1) {
			return 0;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && (client.aClass370_1.method27075().aByteArrayArrayArray12[1][local9][local13] & 0x2) != 0) {
			local35 = arg2 + 1;
		}
		return client.aClass370_1.method26950().aClass17Array3[local35].method3583(arg0, arg1);
	}

	@OriginalMember(owner = "client!fw", name = "mi", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6360)
	static final void method23924(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray24 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}
}
