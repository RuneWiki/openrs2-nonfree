package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiy")
public class Class131_Sub6 extends Class131 {

	@OriginalMember(owner = "client!aiy", name = "l", descriptor = "Lclient!zv;")
	Class703 aClass703_3 = new Class703();

	@OriginalMember(owner = "client!aiy", name = "v", descriptor = "Lclient!uk;")
	public Class579 aClass579_1;

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!uk;)V", line = 12)
	public Class131_Sub6(@OriginalArg(0) Class579 arg0) {
		this.aClass579_1 = arg0;
	}

	@OriginalMember(owner = "client!aiy", name = "y", descriptor = "(IIIIS)V", line = 17)
	public void method13130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class131_Sub1 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class131_Sub1 local9 = (Class131_Sub1) this.aClass703_3.method36536(); local9 != null; local9 = (Class131_Sub1) this.aClass703_3.method36537()) {
			local3++;
			if (arg0 == local9.anInt1415 * 1770939769) {
				local9.method12540(arg0, arg1, arg2, arg3);
				return;
			}
			if (local9.anInt1415 * 1770939769 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class491.method30029(new Class131_Sub1(arg0, arg1, arg2, arg3), local1);
			if (local3 >= Class617.aClass629_1.anInt5668 * -1207315025) {
				this.aClass703_3.method36536().method23056();
			}
		} else if (local3 < Class617.aClass629_1.anInt5668 * -1207315025) {
			this.aClass703_3.method36528(new Class131_Sub1(arg0, arg1, arg2, arg3));
		}
	}

	@OriginalMember(owner = "client!aiy", name = "q", descriptor = "(IIII)V", line = 17)
	public void method13131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class131_Sub1 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class131_Sub1 local9 = (Class131_Sub1) this.aClass703_3.method36536(); local9 != null; local9 = (Class131_Sub1) this.aClass703_3.method36537()) {
			local3++;
			if (arg0 == local9.anInt1415 * 1770939769) {
				local9.method12540(arg0, arg1, arg2, arg3);
				return;
			}
			if (local9.anInt1415 * 1770939769 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class491.method30029(new Class131_Sub1(arg0, arg1, arg2, arg3), local1);
			if (local3 >= Class617.aClass629_1.anInt5668 * -1207315025) {
				this.aClass703_3.method36536().method23056();
			}
		} else if (local3 < Class617.aClass629_1.anInt5668 * -1207315025) {
			this.aClass703_3.method36528(new Class131_Sub1(arg0, arg1, arg2, arg3));
		}
	}

	@OriginalMember(owner = "client!aiy", name = "x", descriptor = "(IIII)V", line = 17)
	public void method13132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class131_Sub1 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class131_Sub1 local9 = (Class131_Sub1) this.aClass703_3.method36536(); local9 != null; local9 = (Class131_Sub1) this.aClass703_3.method36537()) {
			local3++;
			if (arg0 == local9.anInt1415 * 1770939769) {
				local9.method12540(arg0, arg1, arg2, arg3);
				return;
			}
			if (local9.anInt1415 * 1770939769 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class491.method30029(new Class131_Sub1(arg0, arg1, arg2, arg3), local1);
			if (local3 >= Class617.aClass629_1.anInt5668 * -1207315025) {
				this.aClass703_3.method36536().method23056();
			}
		} else if (local3 < Class617.aClass629_1.anInt5668 * -1207315025) {
			this.aClass703_3.method36528(new Class131_Sub1(arg0, arg1, arg2, arg3));
		}
	}

	@OriginalMember(owner = "client!aiy", name = "p", descriptor = "(B)[Lclient!ym;", line = 18)
	static Class670[] method13133() {
		return new Class670[] { Class670.aClass670_10, Class670.aClass670_7, Class670.aClass670_6, Class670.aClass670_9, Class670.aClass670_8, Class670.aClass670_5 };
	}

	@OriginalMember(owner = "client!aiy", name = "w", descriptor = "(II)Lclient!aim;", line = 36)
	public Class131_Sub1 method13134(@OriginalArg(0) int arg0) {
		@Pc(5) Class131_Sub1 local5 = (Class131_Sub1) this.aClass703_3.method36536();
		if (local5 == null || local5.anInt1415 * 1770939769 > arg0) {
			return null;
		}
		for (@Pc(21) Class131_Sub1 local21 = (Class131_Sub1) this.aClass703_3.method36537(); local21 != null && local21.anInt1415 * 1770939769 <= arg0; local21 = (Class131_Sub1) this.aClass703_3.method36537()) {
			local5.method23056();
			local5 = local21;
		}
		if (this.aClass579_1.anInt5435 * 1929647207 + local5.anInt1415 * 1770939769 + local5.anInt1417 * -1162579465 > arg0) {
			return local5;
		} else {
			local5.method23056();
			return null;
		}
	}

	@OriginalMember(owner = "client!aiy", name = "d", descriptor = "(I)Lclient!aim;", line = 36)
	public Class131_Sub1 method13135(@OriginalArg(0) int arg0) {
		@Pc(5) Class131_Sub1 local5 = (Class131_Sub1) this.aClass703_3.method36536();
		if (local5 == null || local5.anInt1415 * 1770939769 > arg0) {
			return null;
		}
		for (@Pc(21) Class131_Sub1 local21 = (Class131_Sub1) this.aClass703_3.method36537(); local21 != null && local21.anInt1415 * 1770939769 <= arg0; local21 = (Class131_Sub1) this.aClass703_3.method36537()) {
			local5.method23056();
			local5 = local21;
		}
		if (this.aClass579_1.anInt5435 * 1929647207 + local5.anInt1415 * 1770939769 + local5.anInt1417 * -1162579465 > arg0) {
			return local5;
		} else {
			local5.method23056();
			return null;
		}
	}

	@OriginalMember(owner = "client!aiy", name = "t", descriptor = "(B)Z", line = 53)
	public boolean method13136() {
		return this.aClass703_3.method36541();
	}

	@OriginalMember(owner = "client!aiy", name = "g", descriptor = "()Z", line = 53)
	public boolean method13137() {
		return this.aClass703_3.method36541();
	}

	@OriginalMember(owner = "client!aiy", name = "z", descriptor = "()Z", line = 53)
	public boolean method13138() {
		return this.aClass703_3.method36541();
	}

	@OriginalMember(owner = "client!aiy", name = "r", descriptor = "()Z", line = 53)
	public boolean method13139() {
		return this.aClass703_3.method36541();
	}

	@OriginalMember(owner = "client!aiy", name = "s", descriptor = "()Z", line = 53)
	public boolean method13140() {
		return this.aClass703_3.method36541();
	}
}
