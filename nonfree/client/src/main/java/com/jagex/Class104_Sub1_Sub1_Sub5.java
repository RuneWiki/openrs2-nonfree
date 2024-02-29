package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atn")
public class Class104_Sub1_Sub1_Sub5 extends Class104_Sub1_Sub1 {

	@OriginalMember(owner = "client!atn", name = "ao", descriptor = "Lclient!wp;")
	Class626 aClass626_4;

	@OriginalMember(owner = "client!atn", name = "aj", descriptor = "I")
	int anInt3208 = 0;

	@OriginalMember(owner = "client!atn", name = "ag", descriptor = "I")
	int anInt3209 = 0;

	@OriginalMember(owner = "client!atn", name = "al", descriptor = "Z")
	boolean aBoolean537 = true;

	@OriginalMember(owner = "client!atn", name = "ak", descriptor = "I")
	int anInt3211 = 0;

	@OriginalMember(owner = "client!atn", name = "h", descriptor = "I")
	int anInt3210;

	@OriginalMember(owner = "client!atn", name = "ai", descriptor = "Lclient!zx;")
	Class151 aClass151_4;

	@OriginalMember(owner = "client!atn", name = "<init>", descriptor = "(Lclient!tk;IIIIIIIIIIIIZI)V", line = 33)
	public Class104_Sub1_Sub1_Sub5(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3210 = arg1 * 935441613;
		this.anInt3208 = arg12 * 851037157;
		this.anInt3211 = arg14 * -844175579;
		@Pc(49) Class679 local49 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt3210 * 2002081797);
		@Pc(54) int local54 = local49.anInt5810 * -811043807;
		if (local54 != -1) {
			this.aClass151_4 = new Class151_Sub3(this, false);
			@Pc(71) int local71 = local49.aBoolean860 ? 0 : 2;
			if (arg13) {
				local71 = 1;
			}
			this.aClass151_4.method23413(local54, arg2, local71, false);
		}
		this.method24135(1);
	}

	@OriginalMember(owner = "client!atn", name = "bz", descriptor = "(I)Z", line = 49)
	@Override
	boolean method24139() {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "ci", descriptor = "()Z", line = 49)
	@Override
	boolean method24174() {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "co", descriptor = "()Z", line = 49)
	@Override
	boolean method24149() {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "bu", descriptor = "(I)Z", line = 53)
	@Override
	boolean method24140() {
		return this.aBoolean537;
	}

	@OriginalMember(owner = "client!atn", name = "cn", descriptor = "()Z", line = 53)
	@Override
	boolean method24162() {
		return this.aBoolean537;
	}

	@OriginalMember(owner = "client!atn", name = "cq", descriptor = "()Z", line = 53)
	@Override
	boolean method24154() {
		return this.aBoolean537;
	}

	@OriginalMember(owner = "client!atn", name = "bt", descriptor = "(I)I", line = 57)
	@Override
	public int method24160() {
		return this.anInt3209 * 1008835189;
	}

	@OriginalMember(owner = "client!atn", name = "cy", descriptor = "()I", line = 57)
	@Override
	public int method24152() {
		return this.anInt3209 * 1008835189;
	}

	@OriginalMember(owner = "client!atn", name = "cs", descriptor = "()I", line = 57)
	@Override
	public int method24151() {
		return this.anInt3209 * 1008835189;
	}

	@OriginalMember(owner = "client!atn", name = "p", descriptor = "(S)I", line = 61)
	public int method23978() {
		return this.anInt3211 * 2120408237;
	}

	@OriginalMember(owner = "client!atn", name = "q", descriptor = "()I", line = 61)
	public int method23979() {
		return this.anInt3211 * 2120408237;
	}

	@OriginalMember(owner = "client!atn", name = "x", descriptor = "()I", line = 61)
	public int method23980() {
		return this.anInt3211 * 2120408237;
	}

	@OriginalMember(owner = "client!atn", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 65)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!atn", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 65)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!atn", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 65)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!atn", name = "c", descriptor = "(IB)V", line = 69)
	public final void method23981(@OriginalArg(0) int arg0) {
		if (this.aClass151_4 != null && !this.aClass151_4.method23445()) {
			this.aClass151_4.method23463(arg0);
		}
	}

	@OriginalMember(owner = "client!atn", name = "s", descriptor = "(I)V", line = 69)
	public final void method23982(@OriginalArg(0) int arg0) {
		if (this.aClass151_4 != null && !this.aClass151_4.method23445()) {
			this.aClass151_4.method23463(arg0);
		}
	}

	@OriginalMember(owner = "client!atn", name = "d", descriptor = "(I)V", line = 69)
	public final void method23983(@OriginalArg(0) int arg0) {
		if (this.aClass151_4 != null && !this.aClass151_4.method23445()) {
			this.aClass151_4.method23463(arg0);
		}
	}

	@OriginalMember(owner = "client!atn", name = "v", descriptor = "(I)Z", line = 73)
	public final boolean method23984() {
		return this.aClass151_4 != null && !this.aClass151_4.method23422();
	}

	@OriginalMember(owner = "client!atn", name = "r", descriptor = "()Z", line = 73)
	public final boolean method23985() {
		return this.aClass151_4 != null && !this.aClass151_4.method23422();
	}

	@OriginalMember(owner = "client!atn", name = "z", descriptor = "()Z", line = 77)
	public final boolean method23986() {
		return this.aClass151_4 == null || this.aClass151_4.method23445();
	}

	@OriginalMember(owner = "client!atn", name = "i", descriptor = "()Z", line = 77)
	public final boolean method23987() {
		return this.aClass151_4 == null || this.aClass151_4.method23445();
	}

	@OriginalMember(owner = "client!atn", name = "l", descriptor = "(I)Z", line = 77)
	public final boolean method23988() {
		return this.aClass151_4 == null || this.aClass151_4.method23445();
	}

	@OriginalMember(owner = "client!atn", name = "g", descriptor = "()Z", line = 77)
	public final boolean method23989() {
		return this.aClass151_4 == null || this.aClass151_4.method23445();
	}

	@OriginalMember(owner = "client!atn", name = "j", descriptor = "()Z", line = 77)
	public final boolean method23990() {
		return this.aClass151_4 == null || this.aClass151_4.method23445();
	}

	@OriginalMember(owner = "client!atn", name = "y", descriptor = "(Lclient!dx;IIB)Lclient!dv;", line = 81)
	Class84 method23991(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class679 local5 = (Class679) Class482.aClass35_Sub4_1.method18319(arg2);
		@Pc(12) Class88 local12 = this.aClass556_23.aClass88Array2[this.aByte100];
		@Pc(27) Class88 local27 = this.aByte99 < 3 ? this.aClass556_23.aClass88Array2[this.aByte99 + 1] : null;
		@Pc(31) Class447 local31 = this.method24085().aClass447_61;
		return this.aClass151_4 == null || this.aClass151_4.method23445() ? local5.method36050(arg0, arg1, this.anInt3208 * -1680906240, local12, local27, (int) local31.aFloat277, (int) local31.aFloat276, (int) local31.aFloat278, null, (byte) 2) : local5.method36050(arg0, arg1, this.anInt3208 * -1680906240, local12, local27, (int) local31.aFloat277, (int) local31.aFloat276, (int) local31.aFloat278, this.aClass151_4, (byte) 2);
	}

	@OriginalMember(owner = "client!atn", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 89)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		@Pc(19) Class84 local19 = this.method23991(arg0, (this.anInt3208 * -1842120211 == 0 ? 0 : 5) | 0x800, this.anInt3210 * 2002081797);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class455 local26 = this.method24094();
		this.method23992(arg0, local19, local26);
		@Pc(36) Class551 local36 = Class346.method27844(false);
		local19.method6813(local26, this.aClass224Array21[0], 0);
		if (this.aClass626_4 != null) {
			@Pc(52) Class207 local52 = this.aClass626_4.method32532();
			arg0.method20120(local52);
		}
		this.aBoolean537 = local19.method6809();
		this.anInt3209 = local19.method6824() * -2144868899;
		local19.method6821();
		return local36;
	}

	@OriginalMember(owner = "client!atn", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 89)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		@Pc(19) Class84 local19 = this.method23991(arg0, (this.anInt3208 * -1842120211 == 0 ? 0 : 5) | 0x800, this.anInt3210 * 2002081797);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class455 local26 = this.method24094();
		this.method23992(arg0, local19, local26);
		@Pc(36) Class551 local36 = Class346.method27844(false);
		local19.method6813(local26, this.aClass224Array21[0], 0);
		if (this.aClass626_4 != null) {
			@Pc(52) Class207 local52 = this.aClass626_4.method32532();
			arg0.method20120(local52);
		}
		this.aBoolean537 = local19.method6809();
		this.anInt3209 = local19.method6824() * -2144868899;
		local19.method6821();
		return local36;
	}

	@OriginalMember(owner = "client!atn", name = "fs", descriptor = "(Lclient!dx;I)V", line = 106)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
		@Pc(9) Class84 local9 = this.method23991(arg0, 0, this.anInt3210 * 2002081797);
		if (local9 != null) {
			this.method23992(arg0, local9, this.method24094());
		}
	}

	@OriginalMember(owner = "client!atn", name = "fn", descriptor = "(Lclient!dx;)V", line = 106)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
		@Pc(9) Class84 local9 = this.method23991(arg0, 0, this.anInt3210 * 2002081797);
		if (local9 != null) {
			this.method23992(arg0, local9, this.method24094());
		}
	}

	@OriginalMember(owner = "client!atn", name = "w", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;B)V", line = 113)
	void method23992(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2) {
		arg1.method6851(arg2);
		@Pc(5) Class205[] local5 = arg1.method6938();
		@Pc(8) Class195[] local8 = arg1.method6843();
		if ((this.aClass626_4 == null || this.aClass626_4.aBoolean844) && (local5 != null || local8 != null)) {
			this.aClass626_4 = Class626.method32493(client.anInt3414, true);
		}
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32515(arg0, (long) client.anInt3414, local5, local8, false);
			this.aClass626_4.method32527(this.aByte100, this.aShort131, this.aShort129, this.aShort132, this.aShort130);
		}
	}

	@OriginalMember(owner = "client!atn", name = "k", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;)V", line = 113)
	void method23993(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2) {
		arg1.method6851(arg2);
		@Pc(5) Class205[] local5 = arg1.method6938();
		@Pc(8) Class195[] local8 = arg1.method6843();
		if ((this.aClass626_4 == null || this.aClass626_4.aBoolean844) && (local5 != null || local8 != null)) {
			this.aClass626_4 = Class626.method32493(client.anInt3414, true);
		}
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32515(arg0, (long) client.anInt3414, local5, local8, false);
			this.aClass626_4.method32527(this.aByte100, this.aShort131, this.aShort129, this.aShort132, this.aShort130);
		}
	}

	@OriginalMember(owner = "client!atn", name = "e", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;)V", line = 113)
	void method23994(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2) {
		arg1.method6851(arg2);
		@Pc(5) Class205[] local5 = arg1.method6938();
		@Pc(8) Class195[] local8 = arg1.method6843();
		if ((this.aClass626_4 == null || this.aClass626_4.aBoolean844) && (local5 != null || local8 != null)) {
			this.aClass626_4 = Class626.method32493(client.anInt3414, true);
		}
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32515(arg0, (long) client.anInt3414, local5, local8, false);
			this.aClass626_4.method32527(this.aByte100, this.aShort131, this.aShort129, this.aShort132, this.aShort130);
		}
	}

	@OriginalMember(owner = "client!atn", name = "f", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;)V", line = 113)
	void method23995(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2) {
		arg1.method6851(arg2);
		@Pc(5) Class205[] local5 = arg1.method6938();
		@Pc(8) Class195[] local8 = arg1.method6843();
		if ((this.aClass626_4 == null || this.aClass626_4.aBoolean844) && (local5 != null || local8 != null)) {
			this.aClass626_4 = Class626.method32493(client.anInt3414, true);
		}
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32515(arg0, (long) client.anInt3414, local5, local8, false);
			this.aClass626_4.method32527(this.aByte100, this.aShort131, this.aShort129, this.aShort132, this.aShort130);
		}
	}

	@OriginalMember(owner = "client!atn", name = "u", descriptor = "(Lclient!dx;Lclient!dv;Lclient!ow;)V", line = 113)
	void method23996(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class455 arg2) {
		arg1.method6851(arg2);
		@Pc(5) Class205[] local5 = arg1.method6938();
		@Pc(8) Class195[] local8 = arg1.method6843();
		if ((this.aClass626_4 == null || this.aClass626_4.aBoolean844) && (local5 != null || local8 != null)) {
			this.aClass626_4 = Class626.method32493(client.anInt3414, true);
		}
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32515(arg0, (long) client.anInt3414, local5, local8, false);
			this.aClass626_4.method32527(this.aByte100, this.aShort131, this.aShort129, this.aShort132, this.aShort130);
		}
	}

	@OriginalMember(owner = "client!atn", name = "t", descriptor = "(B)V", line = 124)
	public void method23997() {
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32504();
		}
	}

	@OriginalMember(owner = "client!atn", name = "o", descriptor = "()V", line = 124)
	public void method23998() {
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32504();
		}
	}

	@OriginalMember(owner = "client!atn", name = "n", descriptor = "()V", line = 124)
	public void method23999() {
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32504();
		}
	}

	@OriginalMember(owner = "client!atn", name = "b", descriptor = "()V", line = 124)
	public void method24000() {
		if (this.aClass626_4 != null) {
			this.aClass626_4.method32504();
		}
	}

	@OriginalMember(owner = "client!atn", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 128)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 128)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 128)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 128)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 128)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fx", descriptor = "()Z", line = 132)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fu", descriptor = "(B)Z", line = 132)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!atn", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 136)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!atn", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 136)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!atn", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 136)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!atn", name = "fd", descriptor = "(I)V", line = 140)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!atn", name = "gj", descriptor = "()V", line = 140)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!atn", name = "gr", descriptor = "()V", line = 140)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!atn", name = "gi", descriptor = "()V", line = 140)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}
}
