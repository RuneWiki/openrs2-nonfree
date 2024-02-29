package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahg")
public class Class115_Sub2 extends Class115 {

	@OriginalMember(owner = "client!ahg", name = "c", descriptor = "I")
	int anInt1155;

	@OriginalMember(owner = "client!ahg", name = "v", descriptor = "Lclient!oo;")
	final Class447 aClass447_42 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahg", name = "l", descriptor = "Lclient!oo;")
	final Class447 aClass447_43 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahg", name = "y", descriptor = "Lclient!oo;")
	final Class447 aClass447_44 = new Class447();

	@OriginalMember(owner = "client!ahg", name = "w", descriptor = "Z")
	boolean aBoolean209 = false;

	@OriginalMember(owner = "client!ahg", name = "<init>", descriptor = "(Lclient!im;)V", line = 19)
	public Class115_Sub2(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "aj", descriptor = "(Lclient!aks;I)V", line = 23)
	public void method10238(@OriginalArg(0) Class77_Sub36 arg0) {
		this.aClass447_43.aFloat277 = arg0.anInt1777 * 599803149;
		this.aClass447_43.aFloat276 = arg0.anInt1778 * -1203728391;
		this.aClass447_43.aFloat278 = arg0.anInt1779 * 33298755;
		if (Float.isNaN(this.aClass447_42.aFloat277)) {
			this.aClass447_42.method29136(this.aClass447_43);
			this.aClass447_44.method29137();
		}
		this.anInt1155 = arg0.anInt1776 * 1592336477;
	}

	@OriginalMember(owner = "client!ahg", name = "ao", descriptor = "(Lclient!aks;)V", line = 23)
	public void method10239(@OriginalArg(0) Class77_Sub36 arg0) {
		this.aClass447_43.aFloat277 = arg0.anInt1777 * 599803149;
		this.aClass447_43.aFloat276 = arg0.anInt1778 * -1203728391;
		this.aClass447_43.aFloat278 = arg0.anInt1779 * 33298755;
		if (Float.isNaN(this.aClass447_42.aFloat277)) {
			this.aClass447_42.method29136(this.aClass447_43);
			this.aClass447_44.method29137();
		}
		this.anInt1155 = arg0.anInt1776 * 1592336477;
	}

	@OriginalMember(owner = "client!ahg", name = "al", descriptor = "(Lclient!aks;)V", line = 23)
	public void method10240(@OriginalArg(0) Class77_Sub36 arg0) {
		this.aClass447_43.aFloat277 = arg0.anInt1777 * 599803149;
		this.aClass447_43.aFloat276 = arg0.anInt1778 * -1203728391;
		this.aClass447_43.aFloat278 = arg0.anInt1779 * 33298755;
		if (Float.isNaN(this.aClass447_42.aFloat277)) {
			this.aClass447_42.method29136(this.aClass447_43);
			this.aClass447_44.method29137();
		}
		this.anInt1155 = arg0.anInt1776 * 1592336477;
	}

	@OriginalMember(owner = "client!ahg", name = "p", descriptor = "(F[[[ILclient!ps;IIB)V", line = 34)
	@Override
	public void method21212(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean209) {
			this.method10246(arg1, arg2, arg3, arg4);
		}
		this.aClass107_13.method8780(true, arg0, this.aClass447_42, this.aClass107_13.method8902(), this.aClass447_43, this.aClass447_44);
	}

	@OriginalMember(owner = "client!ahg", name = "x", descriptor = "(F[[[ILclient!ps;II)V", line = 34)
	@Override
	public void method21215(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean209) {
			this.method10246(arg1, arg2, arg3, arg4);
		}
		this.aClass107_13.method8780(true, arg0, this.aClass447_42, this.aClass107_13.method8902(), this.aClass447_43, this.aClass447_44);
	}

	@OriginalMember(owner = "client!ahg", name = "d", descriptor = "(F[[[ILclient!ps;II)V", line = 34)
	@Override
	public void method21214(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean209) {
			this.method10246(arg1, arg2, arg3, arg4);
		}
		this.aClass107_13.method8780(true, arg0, this.aClass447_42, this.aClass107_13.method8902(), this.aClass447_43, this.aClass447_44);
	}

	@OriginalMember(owner = "client!ahg", name = "s", descriptor = "(F[[[ILclient!ps;II)V", line = 34)
	@Override
	public void method21208(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean209) {
			this.method10246(arg1, arg2, arg3, arg4);
		}
		this.aClass107_13.method8780(true, arg0, this.aClass447_42, this.aClass107_13.method8902(), this.aClass447_43, this.aClass447_44);
	}

	@OriginalMember(owner = "client!ahg", name = "c", descriptor = "(I)Z", line = 39)
	@Override
	public boolean method21207() {
		return !Float.isNaN(this.aClass447_42.aFloat277);
	}

	@OriginalMember(owner = "client!ahg", name = "r", descriptor = "()Z", line = 39)
	@Override
	public boolean method21216() {
		return !Float.isNaN(this.aClass447_42.aFloat277);
	}

	@OriginalMember(owner = "client!ahg", name = "g", descriptor = "()Z", line = 39)
	@Override
	public boolean method21217() {
		return !Float.isNaN(this.aClass447_42.aFloat277);
	}

	@OriginalMember(owner = "client!ahg", name = "z", descriptor = "()Z", line = 39)
	@Override
	public boolean method21223() {
		return !Float.isNaN(this.aClass447_42.aFloat277);
	}

	@OriginalMember(owner = "client!ahg", name = "v", descriptor = "(I)Lclient!oo;", line = 43)
	@Override
	public Class447 method21213() {
		return Class447.method29124(this.aClass447_42);
	}

	@OriginalMember(owner = "client!ahg", name = "k", descriptor = "()Lclient!oo;", line = 43)
	@Override
	public Class447 method21221() {
		return Class447.method29124(this.aClass447_42);
	}

	@OriginalMember(owner = "client!ahg", name = "j", descriptor = "()Lclient!oo;", line = 43)
	@Override
	public Class447 method21219() {
		return Class447.method29124(this.aClass447_42);
	}

	@OriginalMember(owner = "client!ahg", name = "i", descriptor = "()Lclient!oo;", line = 43)
	@Override
	public Class447 method21205() {
		return Class447.method29124(this.aClass447_42);
	}

	@OriginalMember(owner = "client!ahg", name = "u", descriptor = "()Lclient!oo;", line = 43)
	@Override
	public Class447 method21222() {
		return Class447.method29124(this.aClass447_42);
	}

	@OriginalMember(owner = "client!ahg", name = "l", descriptor = "(I)[D", line = 47)
	@Override
	public double[] method21206() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class447 local6 = this.method21213();
		local2[0] = local6.aFloat277;
		local2[1] = local6.aFloat276;
		local2[2] = local6.aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!ahg", name = "e", descriptor = "()[D", line = 47)
	@Override
	public double[] method21220() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class447 local6 = this.method21213();
		local2[0] = local6.aFloat277;
		local2[1] = local6.aFloat276;
		local2[2] = local6.aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!ahg", name = "y", descriptor = "(B)Lclient!aks;", line = 56)
	@Override
	public Class77_Sub36 method21209() {
		return new Class77_Sub36(this.anInt1155 * 540202667, (int) this.aClass447_42.aFloat277, (int) this.aClass447_42.aFloat276, (int) this.aClass447_42.aFloat278);
	}

	@OriginalMember(owner = "client!ahg", name = "f", descriptor = "()Lclient!aks;", line = 56)
	@Override
	public Class77_Sub36 method21211() {
		return new Class77_Sub36(this.anInt1155 * 540202667, (int) this.aClass447_42.aFloat277, (int) this.aClass447_42.aFloat276, (int) this.aClass447_42.aFloat278);
	}

	@OriginalMember(owner = "client!ahg", name = "w", descriptor = "(I)F", line = 60)
	@Override
	public float method21210() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahg", name = "m", descriptor = "()F", line = 60)
	@Override
	public float method21229() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahg", name = "h", descriptor = "()F", line = 60)
	@Override
	public float method21230() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahg", name = "o", descriptor = "(Lclient!ia;II)V", line = 64)
	@Override
	public void method21218(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4067 = ((int) this.aClass447_42.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -this.aClass447_42.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) this.aClass447_42.aFloat278 - arg2) * 1552704101;
	}

	@OriginalMember(owner = "client!ahg", name = "t", descriptor = "(Lclient!ia;IIS)V", line = 64)
	@Override
	public void method21225(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4067 = ((int) this.aClass447_42.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -this.aClass447_42.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) this.aClass447_42.aFloat278 - arg2) * 1552704101;
	}

	@OriginalMember(owner = "client!ahg", name = "b", descriptor = "(Lclient!ia;II)V", line = 64)
	@Override
	public void method21226(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4067 = ((int) this.aClass447_42.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -this.aClass447_42.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) this.aClass447_42.aFloat278 - arg2) * 1552704101;
	}

	@OriginalMember(owner = "client!ahg", name = "q", descriptor = "(Lclient!akv;B)V", line = 70)
	@Override
	public void method21224(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass447_43.method29131(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "n", descriptor = "(Lclient!akv;)V", line = 70)
	@Override
	public void method21227(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass447_43.method29131(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "a", descriptor = "(Lclient!akv;)V", line = 70)
	@Override
	public void method21228(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass447_43.method29131(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "ax", descriptor = "(Z)V", line = 74)
	public void method10241(@OriginalArg(0) boolean arg0) {
		this.aBoolean209 = arg0;
	}

	@OriginalMember(owner = "client!ahg", name = "ai", descriptor = "(ZI)V", line = 74)
	public void method10242(@OriginalArg(0) boolean arg0) {
		this.aBoolean209 = arg0;
	}

	@OriginalMember(owner = "client!ahg", name = "ak", descriptor = "(Z)V", line = 74)
	public void method10243(@OriginalArg(0) boolean arg0) {
		this.aBoolean209 = arg0;
	}

	@OriginalMember(owner = "client!ahg", name = "au", descriptor = "(Z)V", line = 74)
	public void method10244(@OriginalArg(0) boolean arg0) {
		this.aBoolean209 = arg0;
	}

	@OriginalMember(owner = "client!ahg", name = "ar", descriptor = "(Z)V", line = 74)
	public void method10245(@OriginalArg(0) boolean arg0) {
		this.aBoolean209 = arg0;
	}

	@OriginalMember(owner = "client!ahg", name = "ag", descriptor = "([[[ILclient!ps;III)V", line = 78)
	void method10246(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929() || !this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass447_43.aFloat277 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass447_43.aFloat278 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1155 * 540202667;
		if (arg1.method29665(local30, local39)) {
			local66 = this.anInt1155 * 540202667 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass447_43.aFloat277 % 512L;
		@Pc(93) long local93 = (long) this.aClass447_43.aFloat278 % 512L;
		@Pc(110) long local110 = (512L - local86) * (long) arg0[local66][local30][local39] * (512L - local93);
		@Pc(129) long local129 = local110 + (512L - local93) * local86 * (long) arg0[local66][local30 + 1][local39];
		@Pc(148) long local148 = local129 + (long) arg0[local66][local30][local39 + 1] * (512L - local86) * local93;
		@Pc(167) long local167 = local148 + local93 * (long) arg0[local66][local30 + 1][local39 + 1] * local86;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass447_43.aFloat276;
		if (local183 > 0.0F) {
			this.aClass447_43.aFloat276 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "ae", descriptor = "([[[ILclient!ps;II)V", line = 78)
	void method10247(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929() || !this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass447_43.aFloat277 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass447_43.aFloat278 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1155 * 540202667;
		if (arg1.method29665(local30, local39)) {
			local66 = this.anInt1155 * 540202667 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass447_43.aFloat277 % 512L;
		@Pc(93) long local93 = (long) this.aClass447_43.aFloat278 % 512L;
		@Pc(110) long local110 = (512L - local86) * (long) arg0[local66][local30][local39] * (512L - local93);
		@Pc(129) long local129 = local110 + (512L - local93) * local86 * (long) arg0[local66][local30 + 1][local39];
		@Pc(148) long local148 = local129 + (long) arg0[local66][local30][local39 + 1] * (512L - local86) * local93;
		@Pc(167) long local167 = local148 + local93 * (long) arg0[local66][local30 + 1][local39 + 1] * local86;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass447_43.aFloat276;
		if (local183 > 0.0F) {
			this.aClass447_43.aFloat276 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "ad", descriptor = "([[[ILclient!ps;II)V", line = 78)
	void method10248(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929() || !this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass447_43.aFloat277 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass447_43.aFloat278 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1155 * 540202667;
		if (arg1.method29665(local30, local39)) {
			local66 = this.anInt1155 * 540202667 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass447_43.aFloat277 % 512L;
		@Pc(93) long local93 = (long) this.aClass447_43.aFloat278 % 512L;
		@Pc(110) long local110 = (512L - local86) * (long) arg0[local66][local30][local39] * (512L - local93);
		@Pc(129) long local129 = local110 + (512L - local93) * local86 * (long) arg0[local66][local30 + 1][local39];
		@Pc(148) long local148 = local129 + (long) arg0[local66][local30][local39 + 1] * (512L - local86) * local93;
		@Pc(167) long local167 = local148 + local93 * (long) arg0[local66][local30 + 1][local39 + 1] * local86;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass447_43.aFloat276;
		if (local183 > 0.0F) {
			this.aClass447_43.aFloat276 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "av", descriptor = "([[[ILclient!ps;II)V", line = 78)
	void method10249(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929() || !this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass447_43.aFloat277 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass447_43.aFloat278 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1155 * 540202667;
		if (arg1.method29665(local30, local39)) {
			local66 = this.anInt1155 * 540202667 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass447_43.aFloat277 % 512L;
		@Pc(93) long local93 = (long) this.aClass447_43.aFloat278 % 512L;
		@Pc(110) long local110 = (512L - local86) * (long) arg0[local66][local30][local39] * (512L - local93);
		@Pc(129) long local129 = local110 + (512L - local93) * local86 * (long) arg0[local66][local30 + 1][local39];
		@Pc(148) long local148 = local129 + (long) arg0[local66][local30][local39 + 1] * (512L - local86) * local93;
		@Pc(167) long local167 = local148 + local93 * (long) arg0[local66][local30 + 1][local39 + 1] * local86;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass447_43.aFloat276;
		if (local183 > 0.0F) {
			this.aClass447_43.aFloat276 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "at", descriptor = "([[[ILclient!ps;II)V", line = 78)
	void method10250(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929() || !this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass447_43.aFloat277 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass447_43.aFloat278 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1155 * 540202667;
		if (arg1.method29665(local30, local39)) {
			local66 = this.anInt1155 * 540202667 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass447_43.aFloat277 % 512L;
		@Pc(93) long local93 = (long) this.aClass447_43.aFloat278 % 512L;
		@Pc(110) long local110 = (512L - local86) * (long) arg0[local66][local30][local39] * (512L - local93);
		@Pc(129) long local129 = local110 + (512L - local93) * local86 * (long) arg0[local66][local30 + 1][local39];
		@Pc(148) long local148 = local129 + (long) arg0[local66][local30][local39 + 1] * (512L - local86) * local93;
		@Pc(167) long local167 = local148 + local93 * (long) arg0[local66][local30 + 1][local39 + 1] * local86;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass447_43.aFloat276;
		if (local183 > 0.0F) {
			this.aClass447_43.aFloat276 = -local175;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "ac", descriptor = "([[[ILclient!ps;II)V", line = 78)
	void method10251(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929() || !this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(30) int local30 = (int) this.aClass447_43.aFloat277 - arg2 >> 9;
		@Pc(39) int local39 = (int) this.aClass447_43.aFloat278 - arg3 >> 9;
		if (local30 < 0 || local39 < 0 || local30 + 1 >= arg0[0].length || local39 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(66) int local66 = this.anInt1155 * 540202667;
		if (arg1.method29665(local30, local39)) {
			local66 = this.anInt1155 * 540202667 + 1;
		}
		@Pc(86) long local86 = (long) this.aClass447_43.aFloat277 % 512L;
		@Pc(93) long local93 = (long) this.aClass447_43.aFloat278 % 512L;
		@Pc(110) long local110 = (512L - local86) * (long) arg0[local66][local30][local39] * (512L - local93);
		@Pc(129) long local129 = local110 + (512L - local93) * local86 * (long) arg0[local66][local30 + 1][local39];
		@Pc(148) long local148 = local129 + (long) arg0[local66][local30][local39 + 1] * (512L - local86) * local93;
		@Pc(167) long local167 = local148 + local93 * (long) arg0[local66][local30 + 1][local39 + 1] * local86;
		@Pc(171) long local171 = local167 / 262144L;
		@Pc(175) long local175 = local171 - 512L;
		@Pc(183) float local183 = (float) -local175 - this.aClass447_43.aFloat276;
		if (local183 > 0.0F) {
			this.aClass447_43.aFloat276 = -local175;
		}
	}
}
