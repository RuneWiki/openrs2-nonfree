package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahc")
public class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!ahc", name = "y", descriptor = "Z")
	boolean aBoolean200;

	@OriginalMember(owner = "client!ahc", name = "t", descriptor = "I")
	int anInt1128;

	@OriginalMember(owner = "client!ahc", name = "c", descriptor = "Lclient!ir;")
	Interface30 anInterface30_1;

	@OriginalMember(owner = "client!ahc", name = "v", descriptor = "Lclient!oo;")
	final Class447 aClass447_41 = new Class447();

	@OriginalMember(owner = "client!ahc", name = "l", descriptor = "Lclient!ot;")
	public final Class452 aClass452_1 = new Class452();

	@OriginalMember(owner = "client!ahc", name = "w", descriptor = "I")
	int anInt1129 = -2113818376;

	@OriginalMember(owner = "client!ahc", name = "q", descriptor = "Lclient!oo;")
	final Class447 aClass447_38 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahc", name = "x", descriptor = "Lclient!oo;")
	final Class447 aClass447_40 = new Class447(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahc", name = "d", descriptor = "Lclient!oo;")
	final Class447 aClass447_39 = new Class447();

	@OriginalMember(owner = "client!ahc", name = "s", descriptor = "Lclient!ot;")
	final Class452 aClass452_2 = new Class452();

	@OriginalMember(owner = "client!ahc", name = "u", descriptor = "(S)V", line = 20)
	static void method9834() {
		Class141_Sub1.anIntArray219[44] = 71;
		Class141_Sub1.anIntArray219[45] = 26;
		Class141_Sub1.anIntArray219[46] = 72;
		Class141_Sub1.anIntArray219[47] = 73;
		Class141_Sub1.anIntArray219[59] = 57;
		Class141_Sub1.anIntArray219[61] = 27;
		Class141_Sub1.anIntArray219[91] = 42;
		Class141_Sub1.anIntArray219[92] = 74;
		Class141_Sub1.anIntArray219[93] = 43;
		Class141_Sub1.anIntArray219[192] = 28;
		Class141_Sub1.anIntArray219[222] = 58;
		Class141_Sub1.anIntArray219[520] = 59;
	}

	@OriginalMember(owner = "client!ahc", name = "<init>", descriptor = "(Lclient!im;)V", line = 28)
	public Class115_Sub1(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahc", name = "aj", descriptor = "(Lclient!ir;Lclient!oo;Lclient!ot;ZI[[[ILclient!ps;III)V", line = 32)
	public void method9835(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class474 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface30_1 = arg0;
		this.aClass447_41.method29136(arg1);
		this.aClass452_1.method29286(arg2);
		this.aBoolean200 = arg3;
		this.anInt1129 = arg4 * -2029203721;
		this.anInt1128 = this.anInterface30_1.method21051().anInt1776 * -1386163307;
		this.method9846(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ahc", name = "ai", descriptor = "(B)V", line = 42)
	public void method9836() {
		if (this.anInterface30_1 != null) {
			this.anInterface30_1 = this.aClass107_13.method8877().method29827(this.anInterface30_1.method21053(), this.anInterface30_1.method21050());
		}
	}

	@OriginalMember(owner = "client!ahc", name = "at", descriptor = "()V", line = 42)
	public void method9837() {
		if (this.anInterface30_1 != null) {
			this.anInterface30_1 = this.aClass107_13.method8877().method29827(this.anInterface30_1.method21053(), this.anInterface30_1.method21050());
		}
	}

	@OriginalMember(owner = "client!ahc", name = "ac", descriptor = "()V", line = 42)
	public void method9838() {
		if (this.anInterface30_1 != null) {
			this.anInterface30_1 = this.aClass107_13.method8877().method29827(this.anInterface30_1.method21053(), this.anInterface30_1.method21050());
		}
	}

	@OriginalMember(owner = "client!ahc", name = "av", descriptor = "()V", line = 42)
	public void method9839() {
		if (this.anInterface30_1 != null) {
			this.anInterface30_1 = this.aClass107_13.method8877().method29827(this.anInterface30_1.method21053(), this.anInterface30_1.method21050());
		}
	}

	@OriginalMember(owner = "client!ahc", name = "p", descriptor = "(F[[[ILclient!ps;IIB)V", line = 48)
	@Override
	public void method21212(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface30_1 == null) {
			return;
		}
		this.method9846(arg1, arg2, arg3, arg4);
		@Pc(15) Class452 local15 = this.method9843();
		this.aClass452_2.method29342(local15, this.aClass107_13.method8914());
		if (Float.isNaN(this.aClass452_2.aFloat284)) {
			this.aClass452_2.method29286(local15);
		}
		local15.method29277();
		this.aClass447_40.method29136(this.anInterface30_1.method21051().method14453());
		this.aClass107_13.method8780(true, arg0, this.aClass447_38, this.aClass107_13.method8902(), this.aClass447_40, this.aClass447_39);
	}

	@OriginalMember(owner = "client!ahc", name = "s", descriptor = "(F[[[ILclient!ps;II)V", line = 48)
	@Override
	public void method21208(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface30_1 == null) {
			return;
		}
		this.method9846(arg1, arg2, arg3, arg4);
		@Pc(15) Class452 local15 = this.method9843();
		this.aClass452_2.method29342(local15, this.aClass107_13.method8914());
		if (Float.isNaN(this.aClass452_2.aFloat284)) {
			this.aClass452_2.method29286(local15);
		}
		local15.method29277();
		this.aClass447_40.method29136(this.anInterface30_1.method21051().method14453());
		this.aClass107_13.method8780(true, arg0, this.aClass447_38, this.aClass107_13.method8902(), this.aClass447_40, this.aClass447_39);
	}

	@OriginalMember(owner = "client!ahc", name = "d", descriptor = "(F[[[ILclient!ps;II)V", line = 48)
	@Override
	public void method21214(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface30_1 == null) {
			return;
		}
		this.method9846(arg1, arg2, arg3, arg4);
		@Pc(15) Class452 local15 = this.method9843();
		this.aClass452_2.method29342(local15, this.aClass107_13.method8914());
		if (Float.isNaN(this.aClass452_2.aFloat284)) {
			this.aClass452_2.method29286(local15);
		}
		local15.method29277();
		this.aClass447_40.method29136(this.anInterface30_1.method21051().method14453());
		this.aClass107_13.method8780(true, arg0, this.aClass447_38, this.aClass107_13.method8902(), this.aClass447_40, this.aClass447_39);
	}

	@OriginalMember(owner = "client!ahc", name = "x", descriptor = "(F[[[ILclient!ps;II)V", line = 48)
	@Override
	public void method21215(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface30_1 == null) {
			return;
		}
		this.method9846(arg1, arg2, arg3, arg4);
		@Pc(15) Class452 local15 = this.method9843();
		this.aClass452_2.method29342(local15, this.aClass107_13.method8914());
		if (Float.isNaN(this.aClass452_2.aFloat284)) {
			this.aClass452_2.method29286(local15);
		}
		local15.method29277();
		this.aClass447_40.method29136(this.anInterface30_1.method21051().method14453());
		this.aClass107_13.method8780(true, arg0, this.aClass447_38, this.aClass107_13.method8902(), this.aClass447_40, this.aClass447_39);
	}

	@OriginalMember(owner = "client!ahc", name = "am", descriptor = "()Lclient!ot;", line = 61)
	Class452 method9840() {
		@Pc(3) Class452 local3 = Class452.method29276(this.aClass452_1);
		if (this.aBoolean200) {
			@Pc(11) Class447 local11 = this.anInterface30_1.method21055();
			if (local11.method29170() < (float) (this.anInt1129 * -79670585)) {
				local11 = Class447.method29120(0.0F, 0.0F, 1.0F);
				@Pc(30) Class452 local30 = this.anInterface30_1.method21052();
				local11.method29198(local30);
			}
			local11.aFloat276 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat277, (double) local11.aFloat278);
			local11.method29130();
			@Pc(51) Class452 local51 = new Class452();
			local51.method29292(0.0F, 1.0F, 0.0F, local45);
			local3.method29330(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahc", name = "aq", descriptor = "()Lclient!ot;", line = 61)
	Class452 method9841() {
		@Pc(3) Class452 local3 = Class452.method29276(this.aClass452_1);
		if (this.aBoolean200) {
			@Pc(11) Class447 local11 = this.anInterface30_1.method21055();
			if (local11.method29170() < (float) (this.anInt1129 * -79670585)) {
				local11 = Class447.method29120(0.0F, 0.0F, 1.0F);
				@Pc(30) Class452 local30 = this.anInterface30_1.method21052();
				local11.method29198(local30);
			}
			local11.aFloat276 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat277, (double) local11.aFloat278);
			local11.method29130();
			@Pc(51) Class452 local51 = new Class452();
			local51.method29292(0.0F, 1.0F, 0.0F, local45);
			local3.method29330(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahc", name = "as", descriptor = "()Lclient!ot;", line = 61)
	Class452 method9842() {
		@Pc(3) Class452 local3 = Class452.method29276(this.aClass452_1);
		if (this.aBoolean200) {
			@Pc(11) Class447 local11 = this.anInterface30_1.method21055();
			if (local11.method29170() < (float) (this.anInt1129 * -79670585)) {
				local11 = Class447.method29120(0.0F, 0.0F, 1.0F);
				@Pc(30) Class452 local30 = this.anInterface30_1.method21052();
				local11.method29198(local30);
			}
			local11.aFloat276 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat277, (double) local11.aFloat278);
			local11.method29130();
			@Pc(51) Class452 local51 = new Class452();
			local51.method29292(0.0F, 1.0F, 0.0F, local45);
			local3.method29330(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahc", name = "ag", descriptor = "(B)Lclient!ot;", line = 61)
	Class452 method9843() {
		@Pc(3) Class452 local3 = Class452.method29276(this.aClass452_1);
		if (this.aBoolean200) {
			@Pc(11) Class447 local11 = this.anInterface30_1.method21055();
			if (local11.method29170() < (float) (this.anInt1129 * -79670585)) {
				local11 = Class447.method29120(0.0F, 0.0F, 1.0F);
				@Pc(30) Class452 local30 = this.anInterface30_1.method21052();
				local11.method29198(local30);
			}
			local11.aFloat276 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat277, (double) local11.aFloat278);
			local11.method29130();
			@Pc(51) Class452 local51 = new Class452();
			local51.method29292(0.0F, 1.0F, 0.0F, local45);
			local3.method29330(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahc", name = "ae", descriptor = "()Lclient!ot;", line = 61)
	Class452 method9844() {
		@Pc(3) Class452 local3 = Class452.method29276(this.aClass452_1);
		if (this.aBoolean200) {
			@Pc(11) Class447 local11 = this.anInterface30_1.method21055();
			if (local11.method29170() < (float) (this.anInt1129 * -79670585)) {
				local11 = Class447.method29120(0.0F, 0.0F, 1.0F);
				@Pc(30) Class452 local30 = this.anInterface30_1.method21052();
				local11.method29198(local30);
			}
			local11.aFloat276 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat277, (double) local11.aFloat278);
			local11.method29130();
			@Pc(51) Class452 local51 = new Class452();
			local51.method29292(0.0F, 1.0F, 0.0F, local45);
			local3.method29330(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahc", name = "ah", descriptor = "()Lclient!ot;", line = 61)
	Class452 method9845() {
		@Pc(3) Class452 local3 = Class452.method29276(this.aClass452_1);
		if (this.aBoolean200) {
			@Pc(11) Class447 local11 = this.anInterface30_1.method21055();
			if (local11.method29170() < (float) (this.anInt1129 * -79670585)) {
				local11 = Class447.method29120(0.0F, 0.0F, 1.0F);
				@Pc(30) Class452 local30 = this.anInterface30_1.method21052();
				local11.method29198(local30);
			}
			local11.aFloat276 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat277, (double) local11.aFloat278);
			local11.method29130();
			@Pc(51) Class452 local51 = new Class452();
			local51.method29292(0.0F, 1.0F, 0.0F, local45);
			local3.method29330(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahc", name = "al", descriptor = "([[[ILclient!ps;III)V", line = 80)
	void method9846(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929()) {
			return;
		}
		@Pc(18) Class77_Sub36 local18 = this.anInterface30_1.method21051();
		this.anInt1128 = local18.anInt1776 * -1386163307;
		@Pc(29) int local29 = this.anInt1128 * 1286734819;
		@Pc(31) boolean local31 = true;
		if (this.anInt1128 * 1286734819 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method29665(local18.anInt1777 * 599803149 - arg2 >> 9, local18.anInt1779 * 33298755 - arg3 >> 9)) {
			local29 = this.anInt1128 * 1286734819 + 1;
			local31 = false;
		}
		if (!this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9849(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class447 local103 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local103.method29198(this.aClass452_1);
		@Pc(114) Class447 local114 = Class447.method29120(local103.aFloat277, 0.0F, local103.aFloat278);
		local114.method29145();
		@Pc(120) float local120 = Class447.method29165(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class447 local148 = Class447.method29120(1.0F, 0.0F, 0.0F);
			local148.method29198(this.aClass452_1);
			@Pc(154) Class452 local154 = Class452.method29269();
			local154.method29290(local148, local135);
			this.aClass452_1.method29330(local154);
			this.aClass452_1.method29315();
			local148.method29130();
			local154.method29277();
			local88 = this.method9849(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahc", name = "af", descriptor = "([[[ILclient!ps;II)V", line = 80)
	void method9847(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929()) {
			return;
		}
		@Pc(18) Class77_Sub36 local18 = this.anInterface30_1.method21051();
		this.anInt1128 = local18.anInt1776 * -1386163307;
		@Pc(29) int local29 = this.anInt1128 * 1286734819;
		@Pc(31) boolean local31 = true;
		if (this.anInt1128 * 1286734819 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method29665(local18.anInt1777 * 599803149 - arg2 >> 9, local18.anInt1779 * 33298755 - arg3 >> 9)) {
			local29 = this.anInt1128 * 1286734819 + 1;
			local31 = false;
		}
		if (!this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9849(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class447 local103 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local103.method29198(this.aClass452_1);
		@Pc(114) Class447 local114 = Class447.method29120(local103.aFloat277, 0.0F, local103.aFloat278);
		local114.method29145();
		@Pc(120) float local120 = Class447.method29165(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class447 local148 = Class447.method29120(1.0F, 0.0F, 0.0F);
			local148.method29198(this.aClass452_1);
			@Pc(154) Class452 local154 = Class452.method29269();
			local154.method29290(local148, local135);
			this.aClass452_1.method29330(local154);
			this.aClass452_1.method29315();
			local148.method29130();
			local154.method29277();
			local88 = this.method9849(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahc", name = "ay", descriptor = "([[[ILclient!ps;II)V", line = 80)
	void method9848(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21207() || !this.aClass107_13.method8926() && !this.aClass107_13.method8929()) {
			return;
		}
		@Pc(18) Class77_Sub36 local18 = this.anInterface30_1.method21051();
		this.anInt1128 = local18.anInt1776 * -1386163307;
		@Pc(29) int local29 = this.anInt1128 * 1286734819;
		@Pc(31) boolean local31 = true;
		if (this.anInt1128 * 1286734819 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method29665(local18.anInt1777 * 599803149 - arg2 >> 9, local18.anInt1779 * 33298755 - arg3 >> 9)) {
			local29 = this.anInt1128 * 1286734819 + 1;
			local31 = false;
		}
		if (!this.aClass107_13.method8929() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9849(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class447 local103 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local103.method29198(this.aClass452_1);
		@Pc(114) Class447 local114 = Class447.method29120(local103.aFloat277, 0.0F, local103.aFloat278);
		local114.method29145();
		@Pc(120) float local120 = Class447.method29165(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class447 local148 = Class447.method29120(1.0F, 0.0F, 0.0F);
			local148.method29198(this.aClass452_1);
			@Pc(154) Class452 local154 = Class452.method29269();
			local154.method29290(local148, local135);
			this.aClass452_1.method29330(local154);
			this.aClass452_1.method29315();
			local148.method29130();
			local154.method29277();
			local88 = this.method9849(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahc", name = "ao", descriptor = "([[[ILclient!ps;IIIZI)F", line = 129)
	float method9849(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class452 local3 = this.method9843();
		@Pc(8) Class447 local8 = this.method9851(local3);
		local3.method29277();
		@Pc(18) int local18 = (int) local8.aFloat277 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat278 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29130();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method29665(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat277 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat278 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * local68 * (long) arg0[local50][local18 + 1][local26];
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat276;
		local8.method29130();
		return local163;
	}

	@OriginalMember(owner = "client!ahc", name = "an", descriptor = "([[[ILclient!ps;IIIZ)F", line = 129)
	float method9850(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class474 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class452 local3 = this.method9843();
		@Pc(8) Class447 local8 = this.method9851(local3);
		local3.method29277();
		@Pc(18) int local18 = (int) local8.aFloat277 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat278 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29130();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method29665(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat277 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat278 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * local68 * (long) arg0[local50][local18 + 1][local26];
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat276;
		local8.method29130();
		return local163;
	}

	@OriginalMember(owner = "client!ahc", name = "ak", descriptor = "(Lclient!ot;I)Lclient!oo;", line = 158)
	Class447 method9851(@OriginalArg(0) Class452 arg0) {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(arg0);
		@Pc(11) Class447 local11 = Class447.method29154(this.aClass447_40, local3);
		local3.method29130();
		return local11;
	}

	@OriginalMember(owner = "client!ahc", name = "ab", descriptor = "(Lclient!ot;)Lclient!oo;", line = 158)
	Class447 method9852(@OriginalArg(0) Class452 arg0) {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(arg0);
		@Pc(11) Class447 local11 = Class447.method29154(this.aClass447_40, local3);
		local3.method29130();
		return local11;
	}

	@OriginalMember(owner = "client!ahc", name = "aa", descriptor = "(Lclient!ot;)Lclient!oo;", line = 158)
	Class447 method9853(@OriginalArg(0) Class452 arg0) {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(arg0);
		@Pc(11) Class447 local11 = Class447.method29154(this.aClass447_40, local3);
		local3.method29130();
		return local11;
	}

	@OriginalMember(owner = "client!ahc", name = "c", descriptor = "(I)Z", line = 166)
	@Override
	public boolean method21207() {
		return !Float.isNaN(this.aClass447_38.aFloat277);
	}

	@OriginalMember(owner = "client!ahc", name = "r", descriptor = "()Z", line = 166)
	@Override
	public boolean method21216() {
		return !Float.isNaN(this.aClass447_38.aFloat277);
	}

	@OriginalMember(owner = "client!ahc", name = "z", descriptor = "()Z", line = 166)
	@Override
	public boolean method21223() {
		return !Float.isNaN(this.aClass447_38.aFloat277);
	}

	@OriginalMember(owner = "client!ahc", name = "g", descriptor = "()Z", line = 166)
	@Override
	public boolean method21217() {
		return !Float.isNaN(this.aClass447_38.aFloat277);
	}

	@OriginalMember(owner = "client!ahc", name = "v", descriptor = "(I)Lclient!oo;", line = 170)
	@Override
	public Class447 method21213() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(this.aClass452_2);
		@Pc(12) Class447 local12 = Class447.method29154(this.aClass447_38, local3);
		local3.method29130();
		return local12;
	}

	@OriginalMember(owner = "client!ahc", name = "j", descriptor = "()Lclient!oo;", line = 170)
	@Override
	public Class447 method21219() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(this.aClass452_2);
		@Pc(12) Class447 local12 = Class447.method29154(this.aClass447_38, local3);
		local3.method29130();
		return local12;
	}

	@OriginalMember(owner = "client!ahc", name = "i", descriptor = "()Lclient!oo;", line = 170)
	@Override
	public Class447 method21205() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(this.aClass452_2);
		@Pc(12) Class447 local12 = Class447.method29154(this.aClass447_38, local3);
		local3.method29130();
		return local12;
	}

	@OriginalMember(owner = "client!ahc", name = "k", descriptor = "()Lclient!oo;", line = 170)
	@Override
	public Class447 method21221() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(this.aClass452_2);
		@Pc(12) Class447 local12 = Class447.method29154(this.aClass447_38, local3);
		local3.method29130();
		return local12;
	}

	@OriginalMember(owner = "client!ahc", name = "u", descriptor = "()Lclient!oo;", line = 170)
	@Override
	public Class447 method21222() {
		@Pc(3) Class447 local3 = Class447.method29124(this.aClass447_41);
		local3.method29198(this.aClass452_2);
		@Pc(12) Class447 local12 = Class447.method29154(this.aClass447_38, local3);
		local3.method29130();
		return local12;
	}

	@OriginalMember(owner = "client!ahc", name = "l", descriptor = "(I)[D", line = 178)
	@Override
	public double[] method21206() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class447 local6 = this.method21213();
		local2[0] = local6.aFloat277;
		local2[1] = local6.aFloat276;
		local2[2] = local6.aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!ahc", name = "e", descriptor = "()[D", line = 178)
	@Override
	public double[] method21220() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class447 local6 = this.method21213();
		local2[0] = local6.aFloat277;
		local2[1] = local6.aFloat276;
		local2[2] = local6.aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!ahc", name = "y", descriptor = "(B)Lclient!aks;", line = 187)
	@Override
	public Class77_Sub36 method21209() {
		@Pc(3) Class447 local3 = this.method21213();
		@Pc(20) Class77_Sub36 local20 = new Class77_Sub36(this.anInt1128 * 1286734819, (int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278);
		local3.method29130();
		return local20;
	}

	@OriginalMember(owner = "client!ahc", name = "f", descriptor = "()Lclient!aks;", line = 187)
	@Override
	public Class77_Sub36 method21211() {
		@Pc(3) Class447 local3 = this.method21213();
		@Pc(20) Class77_Sub36 local20 = new Class77_Sub36(this.anInt1128 * 1286734819, (int) local3.aFloat277, (int) local3.aFloat276, (int) local3.aFloat278);
		local3.method29130();
		return local20;
	}

	@OriginalMember(owner = "client!ahc", name = "ap", descriptor = "()Lclient!oo;", line = 194)
	public Class447 method9854() {
		return this.aClass447_38;
	}

	@OriginalMember(owner = "client!ahc", name = "au", descriptor = "(I)Lclient!oo;", line = 194)
	public Class447 method9855() {
		return this.aClass447_38;
	}

	@OriginalMember(owner = "client!ahc", name = "aw", descriptor = "()Lclient!oo;", line = 194)
	public Class447 method9856() {
		return this.aClass447_38;
	}

	@OriginalMember(owner = "client!ahc", name = "az", descriptor = "()Lclient!oo;", line = 194)
	public Class447 method9857() {
		return this.aClass447_38;
	}

	@OriginalMember(owner = "client!ahc", name = "ax", descriptor = "(B)Lclient!oo;", line = 198)
	public Class447 method9858() {
		return this.aClass447_41;
	}

	@OriginalMember(owner = "client!ahc", name = "ar", descriptor = "(I)F", line = 202)
	public float method9859() {
		return Class268.method26484(this.aClass452_1);
	}

	@OriginalMember(owner = "client!ahc", name = "bc", descriptor = "()F", line = 202)
	public float method9860() {
		return Class268.method26484(this.aClass452_1);
	}

	@OriginalMember(owner = "client!ahc", name = "ad", descriptor = "(I)F", line = 206)
	public float method9861() {
		return InputStream_Sub1.method17776(this.aClass452_1);
	}

	@OriginalMember(owner = "client!ahc", name = "bj", descriptor = "()F", line = 206)
	public float method9862() {
		return InputStream_Sub1.method17776(this.aClass452_1);
	}

	@OriginalMember(owner = "client!ahc", name = "m", descriptor = "()F", line = 210)
	@Override
	public float method21229() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahc", name = "h", descriptor = "()F", line = 210)
	@Override
	public float method21230() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahc", name = "w", descriptor = "(I)F", line = 210)
	@Override
	public float method21210() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahc", name = "t", descriptor = "(Lclient!ia;IIS)V", line = 214)
	@Override
	public void method21225(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class447 local3 = this.method21213();
		arg0.anInt4067 = ((int) local3.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -local3.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) local3.aFloat278 - arg2) * 1552704101;
		local3.method29130();
	}

	@OriginalMember(owner = "client!ahc", name = "b", descriptor = "(Lclient!ia;II)V", line = 214)
	@Override
	public void method21226(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class447 local3 = this.method21213();
		arg0.anInt4067 = ((int) local3.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -local3.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) local3.aFloat278 - arg2) * 1552704101;
		local3.method29130();
	}

	@OriginalMember(owner = "client!ahc", name = "o", descriptor = "(Lclient!ia;II)V", line = 214)
	@Override
	public void method21218(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class447 local3 = this.method21213();
		arg0.anInt4067 = ((int) local3.aFloat277 - arg1) * -1803517691;
		arg0.anInt4068 = (int) -local3.aFloat276 * -1390317707;
		arg0.anInt4066 = ((int) local3.aFloat278 - arg2) * 1552704101;
		local3.method29130();
	}

	@OriginalMember(owner = "client!ahc", name = "n", descriptor = "(Lclient!akv;)V", line = 222)
	@Override
	public void method21227(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class324 local5 = Class536.method30822(arg0.method22478());
		@Pc(9) int local9 = arg0.method22483();
		this.aClass447_41.method29131(arg0);
		this.aClass452_1.method29280(arg0);
		if (arg0.method22478() == 1) {
			this.aBoolean200 = true;
		} else {
			this.aBoolean200 = false;
		}
		this.anInt1129 = arg0.method22483() * -2029203721;
		this.anInterface30_1 = this.aClass107_13.method8877().method29827(local5, local9);
	}

	@OriginalMember(owner = "client!ahc", name = "a", descriptor = "(Lclient!akv;)V", line = 222)
	@Override
	public void method21228(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class324 local5 = Class536.method30822(arg0.method22478());
		@Pc(9) int local9 = arg0.method22483();
		this.aClass447_41.method29131(arg0);
		this.aClass452_1.method29280(arg0);
		if (arg0.method22478() == 1) {
			this.aBoolean200 = true;
		} else {
			this.aBoolean200 = false;
		}
		this.anInt1129 = arg0.method22483() * -2029203721;
		this.anInterface30_1 = this.aClass107_13.method8877().method29827(local5, local9);
	}

	@OriginalMember(owner = "client!ahc", name = "q", descriptor = "(Lclient!akv;B)V", line = 222)
	@Override
	public void method21224(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class324 local5 = Class536.method30822(arg0.method22478());
		@Pc(9) int local9 = arg0.method22483();
		this.aClass447_41.method29131(arg0);
		this.aClass452_1.method29280(arg0);
		if (arg0.method22478() == 1) {
			this.aBoolean200 = true;
		} else {
			this.aBoolean200 = false;
		}
		this.anInt1129 = arg0.method22483() * -2029203721;
		this.anInterface30_1 = this.aClass107_13.method8877().method29827(local5, local9);
	}

	@OriginalMember(owner = "client!ahc", name = "arw", descriptor = "(Lclient!yf;I)V", line = 12463)
	static final void method9863(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_3.method15901();
	}
}
