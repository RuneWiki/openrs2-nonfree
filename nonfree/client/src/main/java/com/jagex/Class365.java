package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class Class365 implements Interface40 {

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	final int anInt4648;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!ael;")
	final Class41_Sub2 aClass41_Sub2_1;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!ael;I)V", line = 211)
	Class365(@OriginalArg(0) Class41_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt4648 = arg1;
		this.aClass41_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "()I", line = 217)
	@Override
	public int method27214() {
		return this.aClass41_Sub2_1.method8961();
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "()I", line = 217)
	@Override
	public int method27213() {
		return this.aClass41_Sub2_1.method8961();
	}

	@OriginalMember(owner = "client!of", name = "p", descriptor = "()I", line = 217)
	@Override
	public int method27217() {
		return this.aClass41_Sub2_1.method8961();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()I", line = 221)
	@Override
	public int method27212() {
		return this.aClass41_Sub2_1.method8931();
	}

	@OriginalMember(owner = "client!of", name = "s", descriptor = "()I", line = 221)
	@Override
	public int method27216() {
		return this.aClass41_Sub2_1.method8931();
	}

	@OriginalMember(owner = "client!of", name = "x", descriptor = "()I", line = 221)
	@Override
	public int method27211() {
		return this.aClass41_Sub2_1.method8931();
	}

	@OriginalMember(owner = "client!of", name = "u", descriptor = "()I", line = 221)
	@Override
	public int method27215() {
		return this.aClass41_Sub2_1.method8931();
	}

	@OriginalMember(owner = "client!of", name = "z", descriptor = "(I)V", line = 225)
	@Override
	public void method27219(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass41_Sub2_1.anInt1118, this.aClass41_Sub2_1.anInt1121, this.anInt4648);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 225)
	@Override
	public void method27220(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass41_Sub2_1.anInt1118, this.aClass41_Sub2_1.anInt1121, this.anInt4648);
	}

	@OriginalMember(owner = "client!of", name = "j", descriptor = "(I)V", line = 225)
	@Override
	public void method27218(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass41_Sub2_1.anInt1118, this.aClass41_Sub2_1.anInt1121, this.anInt4648);
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "()V", line = 228)
	@Override
	public void method27209() {
	}

	@OriginalMember(owner = "client!of", name = "y", descriptor = "()V", line = 228)
	@Override
	public void method27208() {
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()V", line = 228)
	@Override
	public void method27210() {
	}
}
