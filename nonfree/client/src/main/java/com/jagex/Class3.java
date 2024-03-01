package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public class Class3 {

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "Lclient!ps;")
	public Class3 aClass3_245;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!ps;")
	public Class3 aClass3_246;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "J")
	public long aLong296;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(B)V", line = 9)
	public void method33656() {
		if (this.aClass3_245 != null) {
			this.aClass3_245.aClass3_246 = this.aClass3_246;
			this.aClass3_246.aClass3_245 = this.aClass3_245;
			this.aClass3_246 = null;
			this.aClass3_245 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "()V", line = 9)
	public void method33658() {
		if (this.aClass3_245 != null) {
			this.aClass3_245.aClass3_246 = this.aClass3_246;
			this.aClass3_246.aClass3_245 = this.aClass3_245;
			this.aClass3_246 = null;
			this.aClass3_245 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "()V", line = 9)
	public void method33659() {
		if (this.aClass3_245 != null) {
			this.aClass3_245.aClass3_246 = this.aClass3_246;
			this.aClass3_246.aClass3_245 = this.aClass3_245;
			this.aClass3_246 = null;
			this.aClass3_245 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "()V", line = 9)
	public void method33660() {
		if (this.aClass3_245 != null) {
			this.aClass3_245.aClass3_246 = this.aClass3_246;
			this.aClass3_246.aClass3_245 = this.aClass3_245;
			this.aClass3_246 = null;
			this.aClass3_245 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "()V", line = 9)
	public void method33661() {
		if (this.aClass3_245 != null) {
			this.aClass3_245.aClass3_246 = this.aClass3_246;
			this.aClass3_246.aClass3_245 = this.aClass3_245;
			this.aClass3_246 = null;
			this.aClass3_245 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "()V", line = 9)
	public void method33662() {
		if (this.aClass3_245 != null) {
			this.aClass3_245.aClass3_246 = this.aClass3_246;
			this.aClass3_246.aClass3_245 = this.aClass3_245;
			this.aClass3_246 = null;
			this.aClass3_245 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "(S)Z", line = 17)
	public boolean method33657() {
		return this.aClass3_245 != null;
	}

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "()Z", line = 17)
	public boolean method33663() {
		return this.aClass3_245 != null;
	}

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "()Z", line = 17)
	public boolean method33664() {
		return this.aClass3_245 != null;
	}

	@OriginalMember(owner = "client!ps", name = "gd", descriptor = "(Lclient!vs;B)V", line = 5171)
	static final void method33665(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class326.method26009(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ps", name = "rh", descriptor = "(Lclient!vs;S)V", line = 7272)
	static final void method33666(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3506 * 225266731;
	}

	@OriginalMember(owner = "client!ps", name = "su", descriptor = "(Lclient!vs;I)V", line = 7437)
	static final void method33667(@OriginalArg(0) Class536 arg0) {
		Class527.method32428(arg0);
	}
}
