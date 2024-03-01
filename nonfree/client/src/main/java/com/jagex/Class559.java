package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public class Class559 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Lclient!pt;")
	Class53 aClass53_20;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "Lclient!pt;")
	Class53 aClass53_19 = new Class53();

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 9)
	public Class559() {
		this.aClass53_19.aClass53_17 = this.aClass53_19;
		this.aClass53_19.aClass53_18 = this.aClass53_19;
	}

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "(Ljava/lang/String;II)Lclient!xq;", line = 13)
	public static Class72 method32841(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class72_Sub1 local3 = new Class72_Sub1();
		local3.aString69 = arg0;
		local3.anInt2085 = arg1 * 121991131;
		return local3;
	}

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "(I)V", line = 16)
	public void method32818() {
		while (true) {
			@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
			if (this.aClass53_19 == local3) {
				this.aClass53_20 = null;
				return;
			}
			local3.method20615();
		}
	}

	@OriginalMember(owner = "client!wq", name = "y", descriptor = "()V", line = 16)
	public void method32824() {
		while (true) {
			@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
			if (this.aClass53_19 == local3) {
				this.aClass53_20 = null;
				return;
			}
			local3.method20615();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "()V", line = 16)
	public void method32825() {
		while (true) {
			@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
			if (this.aClass53_19 == local3) {
				this.aClass53_20 = null;
				return;
			}
			local3.method20615();
		}
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "()V", line = 16)
	public void method32826() {
		while (true) {
			@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
			if (this.aClass53_19 == local3) {
				this.aClass53_20 = null;
				return;
			}
			local3.method20615();
		}
	}

	@OriginalMember(owner = "client!wq", name = "z", descriptor = "()V", line = 16)
	public void method32827() {
		while (true) {
			@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
			if (this.aClass53_19 == local3) {
				this.aClass53_20 = null;
				return;
			}
			local3.method20615();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!pt;I)V", line = 24)
	public void method32819(@OriginalArg(0) Class53 arg0) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = this.aClass53_19.aClass53_18;
		arg0.aClass53_17 = this.aClass53_19;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "(Lclient!pt;)V", line = 24)
	public void method32828(@OriginalArg(0) Class53 arg0) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = this.aClass53_19.aClass53_18;
		arg0.aClass53_17 = this.aClass53_19;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "(Lclient!pt;)V", line = 24)
	public void method32829(@OriginalArg(0) Class53 arg0) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = this.aClass53_19.aClass53_18;
		arg0.aClass53_17 = this.aClass53_19;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(Lclient!pt;)V", line = 32)
	public void method32830(@OriginalArg(0) Class53 arg0) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = this.aClass53_19;
		arg0.aClass53_17 = this.aClass53_19.aClass53_17;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "(Lclient!pt;B)V", line = 32)
	public void method32831(@OriginalArg(0) Class53 arg0) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = this.aClass53_19;
		arg0.aClass53_17 = this.aClass53_19.aClass53_17;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "(Lclient!pt;Lclient!pt;)V", line = 40)
	public static void method32820(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = arg1;
		arg0.aClass53_17 = arg1.aClass53_17;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(Lclient!pt;Lclient!pt;)V", line = 40)
	public static void method32821(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = arg1;
		arg0.aClass53_17 = arg1.aClass53_17;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "(Lclient!pt;Lclient!pt;)V", line = 40)
	public static void method32833(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = arg1;
		arg0.aClass53_17 = arg1.aClass53_17;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "(B)Lclient!pt;", line = 48)
	public Class53 method32832() {
		@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
		if (local3 == this.aClass53_19) {
			return null;
		} else {
			local3.method20615();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "()Lclient!pt;", line = 48)
	public Class53 method32834() {
		@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
		if (local3 == this.aClass53_19) {
			return null;
		} else {
			local3.method20615();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "()Lclient!pt;", line = 48)
	public Class53 method32835() {
		@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
		if (local3 == this.aClass53_19) {
			return null;
		} else {
			local3.method20615();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "(B)Lclient!pt;", line = 55)
	public Class53 method32822() {
		@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
		if (local3 == this.aClass53_19) {
			this.aClass53_20 = null;
			return null;
		} else {
			this.aClass53_20 = local3.aClass53_17;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "()Lclient!pt;", line = 55)
	public Class53 method32823() {
		@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
		if (local3 == this.aClass53_19) {
			this.aClass53_20 = null;
			return null;
		} else {
			this.aClass53_20 = local3.aClass53_17;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "()Lclient!pt;", line = 55)
	public Class53 method32836() {
		@Pc(3) Class53 local3 = this.aClass53_19.aClass53_17;
		if (local3 == this.aClass53_19) {
			this.aClass53_20 = null;
			return null;
		} else {
			this.aClass53_20 = local3.aClass53_17;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "(I)Lclient!pt;", line = 65)
	public Class53 method32837() {
		@Pc(2) Class53 local2 = this.aClass53_20;
		if (local2 == this.aClass53_19) {
			this.aClass53_20 = null;
			return null;
		} else {
			this.aClass53_20 = local2.aClass53_17;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "()Lclient!pt;", line = 65)
	public Class53 method32838() {
		@Pc(2) Class53 local2 = this.aClass53_20;
		if (local2 == this.aClass53_19) {
			this.aClass53_20 = null;
			return null;
		} else {
			this.aClass53_20 = local2.aClass53_17;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "()Lclient!pt;", line = 65)
	public Class53 method32839() {
		@Pc(2) Class53 local2 = this.aClass53_20;
		if (local2 == this.aClass53_19) {
			this.aClass53_20 = null;
			return null;
		} else {
			this.aClass53_20 = local2.aClass53_17;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "(I)Z", line = 75)
	public boolean method32817() {
		return this.aClass53_19.aClass53_17 == this.aClass53_19;
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "()Z", line = 75)
	public boolean method32840() {
		return this.aClass53_19.aClass53_17 == this.aClass53_19;
	}

	@OriginalMember(owner = "client!wq", name = "in", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5589)
	static final void method32842(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(14) int local14 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] - 1;
		if (local14 >= 0 && local14 <= 9) {
			arg0.method23483(local14, (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575]);
		} else {
			arg2.anInt5315 -= 790013775;
		}
	}
}
