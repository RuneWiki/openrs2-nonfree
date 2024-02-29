package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zv")
public class Class703 {

	@OriginalMember(owner = "client!zv", name = "lo", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!zv", name = "c", descriptor = "Lclient!sp;")
	Class131 aClass131_19;

	@OriginalMember(owner = "client!zv", name = "p", descriptor = "Lclient!sp;")
	Class131 aClass131_20 = new Class131();

	@OriginalMember(owner = "client!zv", name = "<init>", descriptor = "()V", line = 9)
	public Class703() {
		this.aClass131_20.aClass131_18 = this.aClass131_20;
		this.aClass131_20.aClass131_17 = this.aClass131_20;
	}

	@OriginalMember(owner = "client!zv", name = "p", descriptor = "(I)V", line = 16)
	public void method36521() {
		while (true) {
			@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
			if (local3 == this.aClass131_20) {
				this.aClass131_19 = null;
				return;
			}
			local3.method23056();
		}
	}

	@OriginalMember(owner = "client!zv", name = "d", descriptor = "()V", line = 16)
	public void method36522() {
		while (true) {
			@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
			if (local3 == this.aClass131_20) {
				this.aClass131_19 = null;
				return;
			}
			local3.method23056();
		}
	}

	@OriginalMember(owner = "client!zv", name = "x", descriptor = "()V", line = 16)
	public void method36523() {
		while (true) {
			@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
			if (local3 == this.aClass131_20) {
				this.aClass131_19 = null;
				return;
			}
			local3.method23056();
		}
	}

	@OriginalMember(owner = "client!zv", name = "s", descriptor = "()V", line = 16)
	public void method36524() {
		while (true) {
			@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
			if (local3 == this.aClass131_20) {
				this.aClass131_19 = null;
				return;
			}
			local3.method23056();
		}
	}

	@OriginalMember(owner = "client!zv", name = "c", descriptor = "(Lclient!sp;I)V", line = 24)
	public void method36525(@OriginalArg(0) Class131 arg0) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = this.aClass131_20.aClass131_17;
		arg0.aClass131_18 = this.aClass131_20;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "r", descriptor = "(Lclient!sp;)V", line = 24)
	public void method36526(@OriginalArg(0) Class131 arg0) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = this.aClass131_20.aClass131_17;
		arg0.aClass131_18 = this.aClass131_20;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "g", descriptor = "(Lclient!sp;)V", line = 24)
	public void method36527(@OriginalArg(0) Class131 arg0) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = this.aClass131_20.aClass131_17;
		arg0.aClass131_18 = this.aClass131_20;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "v", descriptor = "(Lclient!sp;B)V", line = 32)
	public void method36528(@OriginalArg(0) Class131 arg0) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = this.aClass131_20;
		arg0.aClass131_18 = this.aClass131_20.aClass131_18;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "z", descriptor = "(Lclient!sp;)V", line = 32)
	public void method36529(@OriginalArg(0) Class131 arg0) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = this.aClass131_20;
		arg0.aClass131_18 = this.aClass131_20.aClass131_18;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "j", descriptor = "(Lclient!sp;Lclient!sp;)V", line = 40)
	public static void method36530(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Class131 arg1) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = arg1;
		arg0.aClass131_18 = arg1.aClass131_18;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "i", descriptor = "(Lclient!sp;Lclient!sp;)V", line = 40)
	public static void method36531(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Class131 arg1) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = arg1;
		arg0.aClass131_18 = arg1.aClass131_18;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!zv", name = "y", descriptor = "(I)Lclient!sp;", line = 48)
	public Class131 method36532() {
		@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
		if (this.aClass131_20 == local3) {
			return null;
		} else {
			local3.method23056();
			return local3;
		}
	}

	@OriginalMember(owner = "client!zv", name = "k", descriptor = "()Lclient!sp;", line = 48)
	public Class131 method36533() {
		@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
		if (this.aClass131_20 == local3) {
			return null;
		} else {
			local3.method23056();
			return local3;
		}
	}

	@OriginalMember(owner = "client!zv", name = "u", descriptor = "()Lclient!sp;", line = 55)
	public Class131 method36534() {
		@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
		if (local3 == this.aClass131_20) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local3.aClass131_18;
			return local3;
		}
	}

	@OriginalMember(owner = "client!zv", name = "e", descriptor = "()Lclient!sp;", line = 55)
	public Class131 method36535() {
		@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
		if (local3 == this.aClass131_20) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local3.aClass131_18;
			return local3;
		}
	}

	@OriginalMember(owner = "client!zv", name = "w", descriptor = "(I)Lclient!sp;", line = 55)
	public Class131 method36536() {
		@Pc(3) Class131 local3 = this.aClass131_20.aClass131_18;
		if (local3 == this.aClass131_20) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local3.aClass131_18;
			return local3;
		}
	}

	@OriginalMember(owner = "client!zv", name = "t", descriptor = "(I)Lclient!sp;", line = 65)
	public Class131 method36537() {
		@Pc(2) Class131 local2 = this.aClass131_19;
		if (this.aClass131_20 == local2) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local2.aClass131_18;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zv", name = "o", descriptor = "()Lclient!sp;", line = 65)
	public Class131 method36538() {
		@Pc(2) Class131 local2 = this.aClass131_19;
		if (this.aClass131_20 == local2) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local2.aClass131_18;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zv", name = "b", descriptor = "()Lclient!sp;", line = 65)
	public Class131 method36539() {
		@Pc(2) Class131 local2 = this.aClass131_19;
		if (this.aClass131_20 == local2) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local2.aClass131_18;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zv", name = "f", descriptor = "()Lclient!sp;", line = 65)
	public Class131 method36540() {
		@Pc(2) Class131 local2 = this.aClass131_19;
		if (this.aClass131_20 == local2) {
			this.aClass131_19 = null;
			return null;
		} else {
			this.aClass131_19 = local2.aClass131_18;
			return local2;
		}
	}

	@OriginalMember(owner = "client!zv", name = "q", descriptor = "(I)Z", line = 75)
	public boolean method36541() {
		return this.aClass131_20 == this.aClass131_20.aClass131_18;
	}

	@OriginalMember(owner = "client!zv", name = "n", descriptor = "()Z", line = 75)
	public boolean method36542() {
		return this.aClass131_20 == this.aClass131_20.aClass131_18;
	}

	@OriginalMember(owner = "client!zv", name = "c", descriptor = "(I)I", line = 81)
	public static int method36543() {
		return Class77_Sub26.aTwitchEventLiveStreams1 == null || Class574.anInt5401 * -297069345 >= Class77_Sub26.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (Class574.anInt5401 += 202745631) * -297069345;
	}

	@OriginalMember(owner = "client!zv", name = "afk", descriptor = "(Lclient!yf;I)V", line = 10411)
	static final void method36544(@OriginalArg(0) Class665 arg0) {
		@Pc(9) String local9;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == null || Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString85 == null) {
			local9 = "";
		} else {
			local9 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21181(false);
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local9;
	}
}
