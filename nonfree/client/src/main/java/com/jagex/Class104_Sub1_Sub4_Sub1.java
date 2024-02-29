package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!air")
public class Class104_Sub1_Sub4_Sub1 extends Class104_Sub1_Sub4 implements Interface61 {

	@OriginalMember(owner = "client!air", name = "j", descriptor = "Lclient!tu;")
	Class563 aClass563_7;

	@OriginalMember(owner = "client!air", name = "r", descriptor = "Lclient!anu;")
	Class35_Sub12 aClass35_Sub12_6;

	@OriginalMember(owner = "client!air", name = "i", descriptor = "I")
	final int anInt1428;

	@OriginalMember(owner = "client!air", name = "u", descriptor = "Z")
	final boolean aBoolean313;

	@OriginalMember(owner = "client!air", name = "k", descriptor = "B")
	final byte aByte53;

	@OriginalMember(owner = "client!air", name = "e", descriptor = "Z")
	boolean aBoolean315;

	@OriginalMember(owner = "client!air", name = "f", descriptor = "Z")
	boolean aBoolean314;

	@OriginalMember(owner = "client!air", name = "o", descriptor = "Z")
	boolean aBoolean316;

	@OriginalMember(owner = "client!air", name = "g", descriptor = "Lclient!dv;")
	Class84 aClass84_4;

	@OriginalMember(owner = "client!air", name = "z", descriptor = "Lclient!arp;")
	Class77_Sub1_Sub16 aClass77_Sub1_Sub16_4;

	@OriginalMember(owner = "client!air", name = "<init>", descriptor = "(Lclient!tk;Lclient!dx;Lclient!anu;Lclient!vm;IIIIIZIZ)V", line = 37)
	public Class104_Sub1_Sub4_Sub1(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class35_Sub12 arg2, @OriginalArg(3) Class599 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5539 * -1303202133);
		this.aClass35_Sub12_6 = arg2;
		this.anInt1428 = arg3.anInt5510 * -534220601;
		this.aBoolean313 = arg9;
		this.aByte53 = (byte) arg10;
		this.aBoolean315 = arg3.anInt5518 * -2134171963 != 0 && !arg9;
		this.aBoolean314 = arg11;
		this.aBoolean316 = arg1.method20206() && arg3.aBoolean816 && !this.aBoolean313 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean314) {
			local63 |= 0x10000;
		}
		if (arg3.aBoolean829) {
			local63 |= 0x80000;
		}
		@Pc(85) Class10 local85 = this.method12922(arg1, local63, this.aBoolean316);
		if (local85 != null) {
			this.aClass84_4 = (Class84) local85.anObject1;
			this.aClass77_Sub1_Sub16_4 = (Class77_Sub1_Sub16) local85.anObject2;
			if (this.aBoolean314 || arg3.aBoolean829) {
				this.aClass84_4 = this.aClass84_4.method6794((byte) 0, local63, false);
				if (arg3.aBoolean829) {
					@Pc(118) Class519 local118 = client.aClass517_1.method30422();
					this.aClass84_4.method6837(local118.anInt5123 * -1440569789, local118.anInt5124 * -1149266637, local118.anInt5125 * -469029139, local118.anInt5126 * -2027110357);
				}
			}
		}
		this.method24135(1);
	}

	@OriginalMember(owner = "client!air", name = "bz", descriptor = "(I)Z", line = 64)
	@Override
	boolean method24139() {
		if (this.aClass84_4 == null) {
			return true;
		} else {
			return !this.aClass84_4.method6840();
		}
	}

	@OriginalMember(owner = "client!air", name = "ci", descriptor = "()Z", line = 64)
	@Override
	boolean method24174() {
		if (this.aClass84_4 == null) {
			return true;
		} else {
			return !this.aClass84_4.method6840();
		}
	}

	@OriginalMember(owner = "client!air", name = "co", descriptor = "()Z", line = 64)
	@Override
	boolean method24149() {
		if (this.aClass84_4 == null) {
			return true;
		} else {
			return !this.aClass84_4.method6840();
		}
	}

	@OriginalMember(owner = "client!air", name = "bu", descriptor = "(I)Z", line = 69)
	@Override
	boolean method24140() {
		return this.aClass84_4 == null ? false : this.aClass84_4.method6809();
	}

	@OriginalMember(owner = "client!air", name = "cq", descriptor = "()Z", line = 69)
	@Override
	boolean method24154() {
		return this.aClass84_4 == null ? false : this.aClass84_4.method6809();
	}

	@OriginalMember(owner = "client!air", name = "cn", descriptor = "()Z", line = 69)
	@Override
	boolean method24162() {
		return this.aClass84_4 == null ? false : this.aClass84_4.method6809();
	}

	@OriginalMember(owner = "client!air", name = "bt", descriptor = "(I)I", line = 74)
	@Override
	public int method24160() {
		return this.aClass84_4 == null ? 0 : this.aClass84_4.method6824();
	}

	@OriginalMember(owner = "client!air", name = "cs", descriptor = "()I", line = 74)
	@Override
	public int method24151() {
		return this.aClass84_4 == null ? 0 : this.aClass84_4.method6824();
	}

	@OriginalMember(owner = "client!air", name = "cy", descriptor = "()I", line = 74)
	@Override
	public int method24152() {
		return this.aClass84_4 == null ? 0 : this.aClass84_4.method6824();
	}

	@OriginalMember(owner = "client!air", name = "bf", descriptor = "(Lclient!dx;II)Lclient!dv;", line = 78)
	Class84 method12920(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_4 != null && arg0.method20116(this.aClass84_4.method6875(), arg1) == 0) {
			return this.aClass84_4;
		} else {
			@Pc(19) Class10 local19 = this.method12922(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!air", name = "bp", descriptor = "(Lclient!dx;I)Lclient!dv;", line = 78)
	Class84 method12921(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_4 != null && arg0.method20116(this.aClass84_4.method6875(), arg1) == 0) {
			return this.aClass84_4;
		} else {
			@Pc(19) Class10 local19 = this.method12922(arg0, arg1, false);
			return local19 == null ? null : (Class84) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!air", name = "bn", descriptor = "(Lclient!dx;IZB)Lclient!aai;", line = 85)
	Class10 method12922(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean313) {
			local19 = this.aClass556_23.aClass88Array3[this.aByte99];
			local25 = this.aClass556_23.aClass88Array2[0];
		} else {
			local19 = this.aClass556_23.aClass88Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass556_23.aClass88Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class447 local53 = this.method24085().aClass447_61;
		return local9.method32000(arg0, arg1, Class593.aClass593_19.anInt5501 * 847393323, this.aByte53, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!air", name = "bm", descriptor = "(Lclient!dx;IZ)Lclient!aai;", line = 85)
	Class10 method12923(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class599 local9 = (Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801);
		@Pc(19) Class88 local19;
		@Pc(25) Class88 local25;
		if (this.aBoolean313) {
			local19 = this.aClass556_23.aClass88Array3[this.aByte99];
			local25 = this.aClass556_23.aClass88Array2[0];
		} else {
			local19 = this.aClass556_23.aClass88Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass556_23.aClass88Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class447 local53 = this.method24085().aClass447_61;
		return local9.method32000(arg0, arg1, Class593.aClass593_19.anInt5501 * 847393323, this.aByte53, local19, local25, (int) local53.aFloat277, (int) local53.aFloat276, (int) local53.aFloat278, arg2, null);
	}

	@OriginalMember(owner = "client!air", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 102)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_7 == null) {
			this.aClass563_7 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method12920(arg0, 0));
		}
		return this.aClass563_7;
	}

	@OriginalMember(owner = "client!air", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 102)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_7 == null) {
			this.aClass563_7 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method12920(arg0, 0));
		}
		return this.aClass563_7;
	}

	@OriginalMember(owner = "client!air", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 102)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		if (this.aClass563_7 == null) {
			this.aClass563_7 = Class534.method30780((int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278, this.method12920(arg0, 0));
		}
		return this.aClass563_7;
	}

	@OriginalMember(owner = "client!air", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 108)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_4 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = this.method24094();
		@Pc(13) Class551 local13 = Class346.method27844(this.aBoolean315);
		@Pc(24) Class441 local24 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local24 == null) {
			this.aClass84_4.method6813(local8, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_4.method6813(local8, null, 0);
			arg0.method20099(local8, this.aClass224Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!air", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 108)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		if (this.aClass84_4 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = this.method24094();
		@Pc(13) Class551 local13 = Class346.method27844(this.aBoolean315);
		@Pc(24) Class441 local24 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local24 == null) {
			this.aClass84_4.method6813(local8, this.aClass224Array21[0], 0);
		} else {
			this.aClass84_4.method6813(local8, null, 0);
			arg0.method20099(local8, this.aClass224Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!air", name = "fn", descriptor = "(Lclient!dx;)V", line = 120)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!air", name = "fs", descriptor = "(Lclient!dx;I)V", line = 120)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!air", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 123)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12920(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!air", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 123)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12920(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!air", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 123)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12920(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!air", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 123)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12920(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!air", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 123)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class441 local10 = ((Class599) this.aClass35_Sub12_6.method18319(this.anInt1428 * -1970666801)).aClass441_2;
		if (local10 != null) {
			return arg0.method20006(arg1, arg2, this.method24094(), local10);
		}
		@Pc(27) Class84 local27 = this.method12920(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class455 local32 = this.method24094();
			return local27.method6818(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!air", name = "fx", descriptor = "()Z", line = 134)
	@Override
	boolean method24148() {
		return this.aBoolean314;
	}

	@OriginalMember(owner = "client!air", name = "fu", descriptor = "(B)Z", line = 134)
	@Override
	boolean method24138() {
		return this.aBoolean314;
	}

	@OriginalMember(owner = "client!air", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 138)
	@Override
	void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub4_Sub1) {
			@Pc(5) Class104_Sub1_Sub4_Sub1 local5 = (Class104_Sub1_Sub4_Sub1) arg1;
			if (this.aClass84_4 != null && local5.aClass84_4 != null) {
				this.aClass84_4.method6855(local5.aClass84_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!air", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 138)
	@Override
	void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub4_Sub1) {
			@Pc(5) Class104_Sub1_Sub4_Sub1 local5 = (Class104_Sub1_Sub4_Sub1) arg1;
			if (this.aClass84_4 != null && local5.aClass84_4 != null) {
				this.aClass84_4.method6855(local5.aClass84_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!air", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 138)
	@Override
	void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class104_Sub1_Sub4_Sub1) {
			@Pc(5) Class104_Sub1_Sub4_Sub1 local5 = (Class104_Sub1_Sub4_Sub1) arg1;
			if (this.aClass84_4 != null && local5.aClass84_4 != null) {
				this.aClass84_4.method6855(local5.aClass84_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!air", name = "gi", descriptor = "()V", line = 145)
	@Override
	void method24164() {
		this.aBoolean314 = false;
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6795(this.aClass84_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!air", name = "fd", descriptor = "(I)V", line = 145)
	@Override
	void method24142() {
		this.aBoolean314 = false;
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6795(this.aClass84_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!air", name = "gr", descriptor = "()V", line = 145)
	@Override
	void method24136() {
		this.aBoolean314 = false;
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6795(this.aClass84_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!air", name = "gj", descriptor = "()V", line = 145)
	@Override
	void method24150() {
		this.aBoolean314 = false;
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6795(this.aClass84_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!air", name = "p", descriptor = "(I)I", line = 150)
	@Override
	public int method13060() {
		return this.anInt1428 * -1970666801;
	}

	@OriginalMember(owner = "client!air", name = "b", descriptor = "()I", line = 150)
	@Override
	public int method13077() {
		return this.anInt1428 * -1970666801;
	}

	@OriginalMember(owner = "client!air", name = "f", descriptor = "()I", line = 150)
	@Override
	public int method13067() {
		return this.anInt1428 * -1970666801;
	}

	@OriginalMember(owner = "client!air", name = "o", descriptor = "()I", line = 150)
	@Override
	public int method13076() {
		return this.anInt1428 * -1970666801;
	}

	@OriginalMember(owner = "client!air", name = "x", descriptor = "()I", line = 154)
	@Override
	public int method13064() {
		return Class593.aClass593_19.anInt5501 * 847393323;
	}

	@OriginalMember(owner = "client!air", name = "c", descriptor = "(I)I", line = 154)
	@Override
	public int method13057() {
		return Class593.aClass593_19.anInt5501 * 847393323;
	}

	@OriginalMember(owner = "client!air", name = "v", descriptor = "(I)I", line = 158)
	@Override
	public int method13058() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!air", name = "d", descriptor = "()I", line = 158)
	@Override
	public int method13065() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!air", name = "s", descriptor = "()I", line = 158)
	@Override
	public int method13073() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!air", name = "r", descriptor = "()V", line = 162)
	@Override
	public void method13079() {
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6796();
		}
	}

	@OriginalMember(owner = "client!air", name = "g", descriptor = "()V", line = 162)
	@Override
	public void method13068() {
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6796();
		}
	}

	@OriginalMember(owner = "client!air", name = "l", descriptor = "(I)V", line = 162)
	@Override
	public void method13059() {
		if (this.aClass84_4 != null) {
			this.aClass84_4.method6796();
		}
	}

	@OriginalMember(owner = "client!air", name = "m", descriptor = "()Z", line = 166)
	@Override
	public boolean method13080() {
		return true;
	}

	@OriginalMember(owner = "client!air", name = "w", descriptor = "(B)Z", line = 166)
	@Override
	public boolean method13062() {
		return true;
	}

	@OriginalMember(owner = "client!air", name = "n", descriptor = "()Z", line = 166)
	@Override
	public boolean method13061() {
		return true;
	}

	@OriginalMember(owner = "client!air", name = "a", descriptor = "()Z", line = 166)
	@Override
	public boolean method13066() {
		return true;
	}

	@OriginalMember(owner = "client!air", name = "h", descriptor = "()Z", line = 166)
	@Override
	public boolean method13081() {
		return true;
	}

	@OriginalMember(owner = "client!air", name = "y", descriptor = "(B)Z", line = 170)
	@Override
	public boolean method13072() {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!air", name = "z", descriptor = "()Z", line = 170)
	@Override
	public boolean method13069() {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!air", name = "k", descriptor = "(Lclient!dx;)V", line = 174)
	@Override
	public void method13071(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!air", name = "t", descriptor = "(Lclient!dx;B)V", line = 174)
	@Override
	public void method13056(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!air", name = "j", descriptor = "(Lclient!dx;)V", line = 174)
	@Override
	public void method13070(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!air", name = "i", descriptor = "(Lclient!dx;)V", line = 174)
	@Override
	public void method13078(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(35) Class447 local35 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31221(local1, this.aByte99, (int) local35.aFloat277, (int) local35.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!air", name = "u", descriptor = "(Lclient!dx;)V", line = 188)
	@Override
	public void method13075(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!air", name = "q", descriptor = "(Lclient!dx;I)V", line = 188)
	@Override
	public void method13063(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}

	@OriginalMember(owner = "client!air", name = "e", descriptor = "(Lclient!dx;)V", line = 188)
	@Override
	public void method13074(@OriginalArg(0) Class86 arg0) {
		@Pc(1) Class77_Sub1_Sub16 local1 = null;
		if (this.aClass77_Sub1_Sub16_4 == null && this.aBoolean316) {
			@Pc(15) Class10 local15 = this.method12922(arg0, 262144, true);
			local1 = (Class77_Sub1_Sub16) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass77_Sub1_Sub16_4;
			this.aClass77_Sub1_Sub16_4 = null;
		}
		@Pc(34) Class447 local34 = this.method24085().aClass447_61;
		if (local1 != null) {
			this.aClass556_23.method31224(local1, this.aByte99, (int) local34.aFloat277, (int) local34.aFloat278, null);
		}
	}
}
