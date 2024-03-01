package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public class Class230 {

	@OriginalMember(owner = "client!dn", name = "fy", descriptor = "Lclient!py;")
	public static Class497 aClass497_99;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Z")
	boolean aBoolean647;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "F")
	float aFloat274;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!db;")
	Class222 aClass222_6;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!db;")
	Class222 aClass222_7;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "[Lclient!ey;")
	Class254[] aClass254Array1;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Z")
	boolean aBoolean648;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "F")
	float aFloat275;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "F")
	float aFloat276;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Z")
	boolean aBoolean649;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "[F")
	float[] aFloatArray98;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "F")
	float aFloat277;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "[F")
	float[] aFloatArray99 = new float[4];

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "[F")
	float[] aFloatArray97 = new float[4];

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Z")
	boolean aBoolean650 = true;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	int anInt3735 = 0;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 24)
	Class230() {
	}

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "(Lclient!alw;I)I", line = 27)
	int method25627(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22415();
		Class263.method26198(arg0.method22413());
		this.aClass222_6 = Class151.method13978(arg0.method22413());
		this.aClass222_7 = Class151.method13978(arg0.method22413());
		this.aBoolean647 = arg0.method22413() != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method25996(arg0, arg1);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25631() + 1];
		for (local40 = this.method25629(); local40 <= this.method25640(); local40++) {
			this.aFloatArray98[local40 - this.method25629()] = Class158.method14311(this, (float) local40);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25629() - 1));
		this.aFloat274 = Class158.method14311(this, (float) (this.method25640() + 1));
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "(Lclient!alw;I)I", line = 27)
	int method25635(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22415();
		Class263.method26198(arg0.method22413());
		this.aClass222_6 = Class151.method13978(arg0.method22413());
		this.aClass222_7 = Class151.method13978(arg0.method22413());
		this.aBoolean647 = arg0.method22413() != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method25996(arg0, arg1);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25631() + 1];
		for (local40 = this.method25629(); local40 <= this.method25640(); local40++) {
			this.aFloatArray98[local40 - this.method25629()] = Class158.method14311(this, (float) local40);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25629() - 1));
		this.aFloat274 = Class158.method14311(this, (float) (this.method25640() + 1));
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(Lclient!alw;I)I", line = 27)
	int method25637(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22415();
		Class263.method26198(arg0.method22413());
		this.aClass222_6 = Class151.method13978(arg0.method22413());
		this.aClass222_7 = Class151.method13978(arg0.method22413());
		this.aBoolean647 = arg0.method22413() != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method25996(arg0, arg1);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25631() + 1];
		for (local40 = this.method25629(); local40 <= this.method25640(); local40++) {
			this.aFloatArray98[local40 - this.method25629()] = Class158.method14311(this, (float) local40);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25629() - 1));
		this.aFloat274 = Class158.method14311(this, (float) (this.method25640() + 1));
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(Lclient!alw;II)I", line = 27)
	int method25647(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22415();
		Class263.method26198(arg0.method22413());
		this.aClass222_6 = Class151.method13978(arg0.method22413());
		this.aClass222_7 = Class151.method13978(arg0.method22413());
		this.aBoolean647 = arg0.method22413() != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method25996(arg0, arg1);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25631() + 1];
		for (local40 = this.method25629(); local40 <= this.method25640(); local40++) {
			this.aFloatArray98[local40 - this.method25629()] = Class158.method14311(this, (float) local40);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25629() - 1));
		this.aFloat274 = Class158.method14311(this, (float) (this.method25640() + 1));
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(Lclient!ov;I)I", line = 45)
	public static int method25652(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29529(0.0F, 0.0F, 1.0F);
		local4.method29572(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29532();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "(II)F", line = 56)
	float method25628(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25629()) {
			return this.aFloat277;
		} else if (arg0 > this.method25640()) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25629()];
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)F", line = 56)
	float method25638(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25629()) {
			return this.aFloat277;
		} else if (arg0 > this.method25640()) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25629()];
		}
	}

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "(I)F", line = 56)
	float method25639(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25629()) {
			return this.aFloat277;
		} else if (arg0 > this.method25640()) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25629()];
		}
	}

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "(I)F", line = 56)
	float method25646(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25629()) {
			return this.aFloat277;
		} else if (arg0 > this.method25640()) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25629()];
		}
	}

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "(I)I", line = 67)
	int method25629() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[0].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "()I", line = 67)
	int method25648() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[0].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "()I", line = 72)
	int method25634() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25626() - 1].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)I", line = 72)
	int method25640() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25626() - 1].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "()I", line = 72)
	int method25641() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25626() - 1].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "()I", line = 72)
	int method25642() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25626() - 1].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "()I", line = 72)
	int method25644() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25626() - 1].anInt3852 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)I", line = 77)
	int method25631() {
		return this.method25640() - this.method25629();
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "()I", line = 77)
	int method25645() {
		return this.method25640() - this.method25629();
	}

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "(FB)I", line = 81)
	int method25632(@OriginalArg(0) float arg0) {
		if (this.anInt3735 * -534580841 >= 0 && (float) (this.aClass254Array1[this.anInt3735 * -534580841].anInt3852 * 1727636433) <= arg0 && (this.aClass254Array1[this.anInt3735 * -534580841].aClass254_1 == null || (float) (this.aClass254Array1[this.anInt3735 * -534580841].aClass254_1.anInt3852 * 1727636433) > arg0)) {
			return this.anInt3735 * -534580841;
		} else if (arg0 < (float) this.method25629() || arg0 > (float) this.method25640()) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method25626();
			@Pc(72) int local72 = this.anInt3735 * -534580841;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass254Array1[local86].anInt3852 * 1727636433)) {
						if (arg0 > (float) (this.aClass254Array1[local86 - 1].anInt3852 * 1727636433)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass254Array1[local86].anInt3852 * 1727636433))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass254Array1[local86 + 1].anInt3852 * 1727636433)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3735 * -534580841) {
				this.anInt3735 = local72 * 1363058215;
				this.aBoolean650 = true;
			}
			return this.anInt3735 * -534580841;
		}
	}

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "(F)I", line = 81)
	int method25650(@OriginalArg(0) float arg0) {
		if (this.anInt3735 * -534580841 >= 0 && (float) (this.aClass254Array1[this.anInt3735 * -534580841].anInt3852 * 1727636433) <= arg0 && (this.aClass254Array1[this.anInt3735 * -534580841].aClass254_1 == null || (float) (this.aClass254Array1[this.anInt3735 * -534580841].aClass254_1.anInt3852 * 1727636433) > arg0)) {
			return this.anInt3735 * -534580841;
		} else if (arg0 < (float) this.method25629() || arg0 > (float) this.method25640()) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method25626();
			@Pc(72) int local72 = this.anInt3735 * -534580841;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass254Array1[local86].anInt3852 * 1727636433)) {
						if (arg0 > (float) (this.aClass254Array1[local86 - 1].anInt3852 * 1727636433)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass254Array1[local86].anInt3852 * 1727636433))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass254Array1[local86 + 1].anInt3852 * 1727636433)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3735 * -534580841) {
				this.anInt3735 = local72 * 1363058215;
				this.aBoolean650 = true;
			}
			return this.anInt3735 * -534580841;
		}
	}

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "(F)Lclient!ey;", line = 126)
	Class254 method25630(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25632(arg0);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "(FI)Lclient!ey;", line = 126)
	Class254 method25633(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25632(arg0);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(F)Lclient!ey;", line = 126)
	Class254 method25636(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25632(arg0);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "(F)Lclient!ey;", line = 126)
	Class254 method25643(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25632(arg0);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "(I)I", line = 136)
	int method25626() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1.length;
	}

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "()I", line = 136)
	int method25649() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1.length;
	}

	@OriginalMember(owner = "client!dn", name = "pu", descriptor = "(Lclient!yf;I)V", line = 7853)
	static final void method25651(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class28.method603(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!dn", name = "aiu", descriptor = "(Lclient!yf;I)V", line = 11366)
	static final void method25653(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.aClass434_1.anIntArray445[local13] = local23;
	}
}
