package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agx")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!agx", name = "d", descriptor = "Lclient!agz;")
	Class105_Sub2 aClass105_Sub2_1;

	@OriginalMember(owner = "client!agx", name = "x", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_1;

	@OriginalMember(owner = "client!agx", name = "s", descriptor = "Z")
	boolean aBoolean196;

	@OriginalMember(owner = "client!agx", name = "<init>", descriptor = "(Lclient!apn;Lclient!ha;)V", line = 14)
	Class112_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class292 arg1) {
		super(arg0, arg1);
		this.aClass86_Sub1_Sub1_1 = arg0;
		this.aBoolean196 = false;
	}

	@OriginalMember(owner = "client!agx", name = "ap", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9554(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub2((Class86_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agx", name = "ab", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9552(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub2((Class86_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agx", name = "y", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9565(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub2((Class86_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agx", name = "aa", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9553(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub2((Class86_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agx", name = "aw", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9555(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub2((Class86_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agx", name = "az", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9556(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub2((Class86_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agx", name = "s", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9547(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			this.aClass105_Sub2_1 = (Class105_Sub2) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean196) {
				this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
				this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
				this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agx", name = "bw", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9561(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			this.aClass105_Sub2_1 = (Class105_Sub2) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean196) {
				this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
				this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
				this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agx", name = "bx", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9560(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			this.aClass105_Sub2_1 = (Class105_Sub2) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean196) {
				this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
				this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
				this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agx", name = "by", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9559(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			this.aClass105_Sub2_1 = (Class105_Sub2) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean196) {
				this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
				this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
				this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agx", name = "bd", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9558(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			this.aClass105_Sub2_1 = (Class105_Sub2) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean196) {
				this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
				this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
				this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agx", name = "z", descriptor = "(Lclient!hf;)Lclient!aqz;", line = 38)
	@Override
	Class77_Sub12_Sub1 method9548(@OriginalArg(0) Class297 arg0) {
		return new Class77_Sub12_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!agx", name = "bs", descriptor = "(Lclient!hf;)Lclient!aqz;", line = 38)
	@Override
	Class77_Sub12_Sub1 method9546(@OriginalArg(0) Class297 arg0) {
		return new Class77_Sub12_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!agx", name = "dq", descriptor = "()V", line = 42)
	@Override
	public void method9566() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "da", descriptor = "()V", line = 42)
	@Override
	public void method9569() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "dh", descriptor = "()V", line = 42)
	@Override
	public void method9563() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "p", descriptor = "()V", line = 42)
	@Override
	public void method9545() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "dn", descriptor = "()V", line = 42)
	@Override
	public void method9567() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "dv", descriptor = "()V", line = 42)
	@Override
	public void method9568() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "dy", descriptor = "()V", line = 42)
	@Override
	public void method9551() {
		if (this.aClass105_Sub2_1 == null) {
			throw new RuntimeException_Sub3();
		}
		this.aClass86_Sub1_Sub1_1.method19549(this.aClass105_Sub2_1.aLong35);
		this.aClass86_Sub1_Sub1_1.method19553(this.aClass105_Sub2_1.aLong36);
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = this.aClass105_Sub2_1;
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!agx", name = "c", descriptor = "()V", line = 50)
	@Override
	public void method9543() {
		this.aClass86_Sub1_Sub1_1.method19549(0L);
		this.aClass86_Sub1_Sub1_1.method19553(0L);
		this.aBoolean196 = false;
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = null;
		this.aClass86_Sub1_Sub1_1.method20540(1);
		this.aClass86_Sub1_Sub1_1.method20542(null);
		this.aClass86_Sub1_Sub1_1.method20540(0);
		this.aClass86_Sub1_Sub1_1.method20542(null);
	}

	@OriginalMember(owner = "client!agx", name = "ah", descriptor = "()V", line = 50)
	@Override
	public void method9549() {
		this.aClass86_Sub1_Sub1_1.method19549(0L);
		this.aClass86_Sub1_Sub1_1.method19553(0L);
		this.aBoolean196 = false;
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = null;
		this.aClass86_Sub1_Sub1_1.method20540(1);
		this.aClass86_Sub1_Sub1_1.method20542(null);
		this.aClass86_Sub1_Sub1_1.method20540(0);
		this.aClass86_Sub1_Sub1_1.method20542(null);
	}

	@OriginalMember(owner = "client!agx", name = "as", descriptor = "()V", line = 50)
	@Override
	public void method9557() {
		this.aClass86_Sub1_Sub1_1.method19549(0L);
		this.aClass86_Sub1_Sub1_1.method19553(0L);
		this.aBoolean196 = false;
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = null;
		this.aClass86_Sub1_Sub1_1.method20540(1);
		this.aClass86_Sub1_Sub1_1.method20542(null);
		this.aClass86_Sub1_Sub1_1.method20540(0);
		this.aClass86_Sub1_Sub1_1.method20542(null);
	}

	@OriginalMember(owner = "client!agx", name = "aq", descriptor = "()V", line = 50)
	@Override
	public void method9562() {
		this.aClass86_Sub1_Sub1_1.method19549(0L);
		this.aClass86_Sub1_Sub1_1.method19553(0L);
		this.aBoolean196 = false;
		this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 = null;
		this.aClass86_Sub1_Sub1_1.method20540(1);
		this.aClass86_Sub1_Sub1_1.method20542(null);
		this.aClass86_Sub1_Sub1_1.method20540(0);
		this.aClass86_Sub1_Sub1_1.method20542(null);
	}

	@OriginalMember(owner = "client!agx", name = "v", descriptor = "()Z", line = 61)
	@Override
	public boolean method9544() {
		return this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 == this.aClass105_Sub2_1;
	}

	@OriginalMember(owner = "client!agx", name = "ay", descriptor = "()Z", line = 61)
	@Override
	public boolean method9550() {
		return this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 == this.aClass105_Sub2_1;
	}

	@OriginalMember(owner = "client!agx", name = "am", descriptor = "()Z", line = 61)
	@Override
	public boolean method9564() {
		return this.aClass86_Sub1_Sub1_1.aClass105_Sub2_2 == this.aClass105_Sub2_1;
	}
}
