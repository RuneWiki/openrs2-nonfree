package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agy")
public class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!agy", name = "d", descriptor = "Lclient!agj;")
	Class105_Sub1 aClass105_Sub1_1;

	@OriginalMember(owner = "client!agy", name = "s", descriptor = "I")
	int anInt1106;

	@OriginalMember(owner = "client!agy", name = "x", descriptor = "Lclient!apr;")
	final Class86_Sub1_Sub2 aClass86_Sub1_Sub2_2;

	@OriginalMember(owner = "client!agy", name = "<init>", descriptor = "(Lclient!apr;Lclient!ha;)V", line = 15)
	Class112_Sub2(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class292 arg1) {
		super(arg0, arg1);
		this.aClass86_Sub1_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!agy", name = "aw", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9555(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub1((Class86_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "y", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9565(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub1((Class86_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "az", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9556(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub1((Class86_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "ab", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9552(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub1((Class86_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "aa", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9553(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub1((Class86_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "ap", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;", line = 20)
	@Override
	Class105 method9554(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		return new Class105_Sub1((Class86_Sub1_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "by", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9559(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			@Pc(13) boolean local13 = this.method9544();
			this.aClass105_Sub1_1 = (Class105_Sub1) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt1106 = this.aClass105_Sub1_1.anInt1012;
			if (local13) {
				OpenGL.glUseProgram(this.anInt1106);
				this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agy", name = "bd", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9558(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			@Pc(13) boolean local13 = this.method9544();
			this.aClass105_Sub1_1 = (Class105_Sub1) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt1106 = this.aClass105_Sub1_1.anInt1012;
			if (local13) {
				OpenGL.glUseProgram(this.anInt1106);
				this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agy", name = "bx", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9560(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			@Pc(13) boolean local13 = this.method9544();
			this.aClass105_Sub1_1 = (Class105_Sub1) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt1106 = this.aClass105_Sub1_1.anInt1012;
			if (local13) {
				OpenGL.glUseProgram(this.anInt1106);
				this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agy", name = "s", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9547(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			@Pc(13) boolean local13 = this.method9544();
			this.aClass105_Sub1_1 = (Class105_Sub1) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt1106 = this.aClass105_Sub1_1.anInt1012;
			if (local13) {
				OpenGL.glUseProgram(this.anInt1106);
				this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agy", name = "bw", descriptor = "(Lclient!hr;)Z", line = 24)
	@Override
	public boolean method9561(@OriginalArg(0) Class105 arg0) {
		if (this.aClass105_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method9595()) {
			@Pc(13) boolean local13 = this.method9544();
			this.aClass105_Sub1_1 = (Class105_Sub1) arg0;
			this.anInt1105 = this.method9463(arg0) * -1164303385;
			if (this.anInt1105 * 567951319 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt1106 = this.aClass105_Sub1_1.anInt1012;
			if (local13) {
				OpenGL.glUseProgram(this.anInt1106);
				this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agy", name = "z", descriptor = "(Lclient!hf;)Lclient!aqz;", line = 39)
	@Override
	Class77_Sub12_Sub1 method9548(@OriginalArg(0) Class297 arg0) {
		return new Class77_Sub12_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agy", name = "bs", descriptor = "(Lclient!hf;)Lclient!aqz;", line = 39)
	@Override
	Class77_Sub12_Sub1 method9546(@OriginalArg(0) Class297 arg0) {
		return new Class77_Sub12_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!agy", name = "p", descriptor = "()V", line = 43)
	@Override
	public void method9545() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "dv", descriptor = "()V", line = 43)
	@Override
	public void method9568() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "dh", descriptor = "()V", line = 43)
	@Override
	public void method9563() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "dq", descriptor = "()V", line = 43)
	@Override
	public void method9566() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "dn", descriptor = "()V", line = 43)
	@Override
	public void method9567() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "da", descriptor = "()V", line = 43)
	@Override
	public void method9569() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "dy", descriptor = "()V", line = 43)
	@Override
	public void method9551() {
		if (this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1) {
			return;
		}
		if (this.aClass105_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt1106);
		this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 = this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "aq", descriptor = "()V", line = 49)
	@Override
	public void method9562() {
	}

	@OriginalMember(owner = "client!agy", name = "c", descriptor = "()V", line = 49)
	@Override
	public void method9543() {
	}

	@OriginalMember(owner = "client!agy", name = "ah", descriptor = "()V", line = 49)
	@Override
	public void method9549() {
	}

	@OriginalMember(owner = "client!agy", name = "as", descriptor = "()V", line = 49)
	@Override
	public void method9557() {
	}

	@OriginalMember(owner = "client!agy", name = "v", descriptor = "()Z", line = 52)
	@Override
	public boolean method9544() {
		return this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "am", descriptor = "()Z", line = 52)
	@Override
	public boolean method9564() {
		return this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "ay", descriptor = "()Z", line = 52)
	@Override
	public boolean method9550() {
		return this.aClass86_Sub1_Sub2_2.aClass105_Sub1_2 == this.aClass105_Sub1_1;
	}

	@OriginalMember(owner = "client!agy", name = "ae", descriptor = "()V", line = 56)
	@Override
	void method9539() {
		for (@Pc(1) int local1 = 0; local1 < this.method9460(); local1++) {
			((Class105_Sub1) this.method9461(local1)).method30322();
		}
		super.method9539();
	}

	@OriginalMember(owner = "client!agy", name = "dt", descriptor = "()V", line = 56)
	@Override
	void method9540() {
		for (@Pc(1) int local1 = 0; local1 < this.method9460(); local1++) {
			((Class105_Sub1) this.method9461(local1)).method30322();
		}
		super.method9539();
	}

	@OriginalMember(owner = "client!agy", name = "finalize", descriptor = "()V", line = 63)
	@Override
	void finalize() throws Throwable {
		this.method9539();
		super.finalize();
	}

	@OriginalMember(owner = "client!agy", name = "hd", descriptor = "()V", line = 63)
	void method9570() throws Throwable {
		this.method9539();
		super.finalize();
	}

	@OriginalMember(owner = "client!agy", name = "hp", descriptor = "()V", line = 63)
	void method9571() throws Throwable {
		this.method9539();
		super.finalize();
	}

	@OriginalMember(owner = "client!agy", name = "hc", descriptor = "()V", line = 63)
	void method9572() throws Throwable {
		this.method9539();
		super.finalize();
	}
}
