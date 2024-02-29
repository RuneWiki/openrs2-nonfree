package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arr")
public class Class77_Sub1_Sub17 extends Class77_Sub1 {

	@OriginalMember(owner = "client!arr", name = "q", descriptor = "Lclient!pw;")
	static Class478 aClass478_84;

	@OriginalMember(owner = "client!arr", name = "t", descriptor = "Lclient!pw;")
	static Class478 aClass478_85;

	@OriginalMember(owner = "client!arr", name = "d", descriptor = "[[B")
	byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!arr", name = "s", descriptor = "[Lclient!dc;")
	Class203[] aClass203Array1;

	@OriginalMember(owner = "client!arr", name = "x", descriptor = "I")
	int anInt3104;

	@OriginalMember(owner = "client!arr", name = "w", descriptor = "(Lclient!pw;Lclient!pw;I)V", line = 16)
	public static void method22747(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1) {
		aClass478_85 = arg0;
		aClass478_84 = arg1;
	}

	@OriginalMember(owner = "client!arr", name = "<init>", descriptor = "(I)V", line = 20)
	public Class77_Sub1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt3104 = arg0 * 421945427;
	}

	@OriginalMember(owner = "client!arr", name = "c", descriptor = "(I)Z", line = 25)
	public boolean method22748() {
		if (this.aClass203Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class478 local12 = aClass478_85;
			synchronized (aClass478_85) {
				if (!aClass478_85.method29733(this.anInt3104 * -403250213)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass478_85.method29746(this.anInt3104 * -403250213);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass478_85.method29725(this.anInt3104 * -403250213, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class77_Sub39 local87 = new Class77_Sub39(local82);
			local87.anInt3089 = -1387468933;
			local94 = local87.method22483();
			@Pc(97) Class478 local97 = aClass478_84;
			synchronized (aClass478_84) {
				local70 &= aClass478_84.method29730(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class695 local123 = new Class695();
		@Pc(126) Class478 local126 = aClass478_85;
		@Pc(147) int[] local147;
		synchronized (aClass478_85) {
			local94 = aClass478_85.method29752(this.anInt3104 * -403250213);
			this.aClass203Array1 = new Class203[local94];
			local147 = aClass478_85.method29746(this.anInt3104 * -403250213);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class77_Sub39 local171 = new Class77_Sub39(local166);
			local171.anInt3089 = -1387468933;
			@Pc(178) int local178 = local171.method22483();
			@Pc(180) Class77_Sub23 local180 = null;
			for (@Pc(185) Class77_Sub23 local185 = (Class77_Sub23) local123.method36395(); local185 != null; local185 = (Class77_Sub23) local123.method36406()) {
				if (local185.anInt1545 * -884140749 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(207) Class478 local207 = aClass478_84;
				synchronized (aClass478_84) {
					local180 = new Class77_Sub23(local178, aClass478_84.method29745(local178));
				}
				local123.method36383(local180);
			}
			this.aClass203Array1[local147[local157]] = new Class203(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "t", descriptor = "()Z", line = 25)
	public boolean method22749() {
		if (this.aClass203Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class478 local12 = aClass478_85;
			synchronized (aClass478_85) {
				if (!aClass478_85.method29733(this.anInt3104 * -403250213)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass478_85.method29746(this.anInt3104 * -403250213);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass478_85.method29725(this.anInt3104 * -403250213, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class77_Sub39 local87 = new Class77_Sub39(local82);
			local87.anInt3089 = -1387468933;
			local94 = local87.method22483();
			@Pc(97) Class478 local97 = aClass478_84;
			synchronized (aClass478_84) {
				local70 &= aClass478_84.method29730(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class695 local123 = new Class695();
		@Pc(126) Class478 local126 = aClass478_85;
		@Pc(147) int[] local147;
		synchronized (aClass478_85) {
			local94 = aClass478_85.method29752(this.anInt3104 * -403250213);
			this.aClass203Array1 = new Class203[local94];
			local147 = aClass478_85.method29746(this.anInt3104 * -403250213);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class77_Sub39 local171 = new Class77_Sub39(local166);
			local171.anInt3089 = -1387468933;
			@Pc(178) int local178 = local171.method22483();
			@Pc(180) Class77_Sub23 local180 = null;
			for (@Pc(185) Class77_Sub23 local185 = (Class77_Sub23) local123.method36395(); local185 != null; local185 = (Class77_Sub23) local123.method36406()) {
				if (local185.anInt1545 * -884140749 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(207) Class478 local207 = aClass478_84;
				synchronized (aClass478_84) {
					local180 = new Class77_Sub23(local178, aClass478_84.method29745(local178));
				}
				local123.method36383(local180);
			}
			this.aClass203Array1[local147[local157]] = new Class203(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "x", descriptor = "()Z", line = 25)
	public boolean method22750() {
		if (this.aClass203Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class478 local12 = aClass478_85;
			synchronized (aClass478_85) {
				if (!aClass478_85.method29733(this.anInt3104 * -403250213)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass478_85.method29746(this.anInt3104 * -403250213);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass478_85.method29725(this.anInt3104 * -403250213, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class77_Sub39 local87 = new Class77_Sub39(local82);
			local87.anInt3089 = -1387468933;
			local94 = local87.method22483();
			@Pc(97) Class478 local97 = aClass478_84;
			synchronized (aClass478_84) {
				local70 &= aClass478_84.method29730(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class695 local123 = new Class695();
		@Pc(126) Class478 local126 = aClass478_85;
		@Pc(147) int[] local147;
		synchronized (aClass478_85) {
			local94 = aClass478_85.method29752(this.anInt3104 * -403250213);
			this.aClass203Array1 = new Class203[local94];
			local147 = aClass478_85.method29746(this.anInt3104 * -403250213);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class77_Sub39 local171 = new Class77_Sub39(local166);
			local171.anInt3089 = -1387468933;
			@Pc(178) int local178 = local171.method22483();
			@Pc(180) Class77_Sub23 local180 = null;
			for (@Pc(185) Class77_Sub23 local185 = (Class77_Sub23) local123.method36395(); local185 != null; local185 = (Class77_Sub23) local123.method36406()) {
				if (local185.anInt1545 * -884140749 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(207) Class478 local207 = aClass478_84;
				synchronized (aClass478_84) {
					local180 = new Class77_Sub23(local178, aClass478_84.method29745(local178));
				}
				local123.method36383(local180);
			}
			this.aClass203Array1[local147[local157]] = new Class203(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "q", descriptor = "()Z", line = 25)
	public boolean method22751() {
		if (this.aClass203Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class478 local12 = aClass478_85;
			synchronized (aClass478_85) {
				if (!aClass478_85.method29733(this.anInt3104 * -403250213)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass478_85.method29746(this.anInt3104 * -403250213);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass478_85.method29725(this.anInt3104 * -403250213, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class77_Sub39 local87 = new Class77_Sub39(local82);
			local87.anInt3089 = -1387468933;
			local94 = local87.method22483();
			@Pc(97) Class478 local97 = aClass478_84;
			synchronized (aClass478_84) {
				local70 &= aClass478_84.method29730(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class695 local123 = new Class695();
		@Pc(126) Class478 local126 = aClass478_85;
		@Pc(147) int[] local147;
		synchronized (aClass478_85) {
			local94 = aClass478_85.method29752(this.anInt3104 * -403250213);
			this.aClass203Array1 = new Class203[local94];
			local147 = aClass478_85.method29746(this.anInt3104 * -403250213);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class77_Sub39 local171 = new Class77_Sub39(local166);
			local171.anInt3089 = -1387468933;
			@Pc(178) int local178 = local171.method22483();
			@Pc(180) Class77_Sub23 local180 = null;
			for (@Pc(185) Class77_Sub23 local185 = (Class77_Sub23) local123.method36395(); local185 != null; local185 = (Class77_Sub23) local123.method36406()) {
				if (local185.anInt1545 * -884140749 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(207) Class478 local207 = aClass478_84;
				synchronized (aClass478_84) {
					local180 = new Class77_Sub23(local178, aClass478_84.method29745(local178));
				}
				local123.method36383(local180);
			}
			this.aClass203Array1[local147[local157]] = new Class203(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "v", descriptor = "(II)Z", line = 77)
	public boolean method22752(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean634;
	}

	@OriginalMember(owner = "client!arr", name = "s", descriptor = "(I)Z", line = 77)
	public boolean method22753(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean634;
	}

	@OriginalMember(owner = "client!arr", name = "r", descriptor = "(I)Z", line = 77)
	public boolean method22754(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean634;
	}

	@OriginalMember(owner = "client!arr", name = "g", descriptor = "(I)Z", line = 77)
	public boolean method22755(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean634;
	}

	@OriginalMember(owner = "client!arr", name = "d", descriptor = "(I)Z", line = 77)
	public boolean method22756(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean634;
	}

	@OriginalMember(owner = "client!arr", name = "z", descriptor = "(I)Z", line = 81)
	public boolean method22757(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean635;
	}

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "(IB)Z", line = 81)
	public boolean method22758(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean635;
	}

	@OriginalMember(owner = "client!arr", name = "n", descriptor = "(I)Z", line = 81)
	public boolean method22759(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean635;
	}

	@OriginalMember(owner = "client!arr", name = "b", descriptor = "(I)Z", line = 81)
	public boolean method22760(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean635;
	}

	@OriginalMember(owner = "client!arr", name = "j", descriptor = "(I)Z", line = 81)
	public boolean method22761(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean635;
	}

	@OriginalMember(owner = "client!arr", name = "y", descriptor = "(II)Z", line = 85)
	public boolean method22762(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean633;
	}

	@OriginalMember(owner = "client!arr", name = "a", descriptor = "(I)Z", line = 85)
	public boolean method22763(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean633;
	}

	@OriginalMember(owner = "client!arr", name = "m", descriptor = "(I)Z", line = 85)
	public boolean method22764(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean633;
	}

	@OriginalMember(owner = "client!arr", name = "ai", descriptor = "(I)Z", line = 85)
	public boolean method22765(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0].aBoolean633;
	}
}
