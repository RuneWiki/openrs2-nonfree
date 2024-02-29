package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class Class158 implements Interface21 {

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	final int anInt3248;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
	final int anInt3249;

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "[I")
	final int[] anIntArray300;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(II)V", line = 11)
	Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this(arg0, arg1, new int[arg0 * arg1]);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(II[I)V", line = 14)
	Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt3249 = arg0 * -313399029;
		this.anInt3248 = arg1 * 641055541;
		this.anIntArray300 = arg2;
	}

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "()I", line = 21)
	@Override
	public int method30324() {
		return this.anInt3249 * 351836835;
	}

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "()I", line = 21)
	@Override
	public int method30325() {
		return this.anInt3249 * 351836835;
	}

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "()I", line = 21)
	@Override
	public int method30326() {
		return this.anInt3249 * 351836835;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "()I", line = 25)
	@Override
	public int method30331() {
		return this.anInt3248 * -357499107;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "()I", line = 25)
	@Override
	public int method30329() {
		return this.anInt3248 * -357499107;
	}

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "()I", line = 25)
	@Override
	public int method30323() {
		return this.anInt3248 * -357499107;
	}

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "()I", line = 25)
	@Override
	public int method30328() {
		return this.anInt3248 * -357499107;
	}

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "()I", line = 25)
	@Override
	public int method30330() {
		return this.anInt3248 * -357499107;
	}

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "()I", line = 25)
	@Override
	public int method30327() {
		return this.anInt3248 * -357499107;
	}

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "()V", line = 28)
	@Override
	public void method30321() {
	}

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "()V", line = 28)
	@Override
	public void method30320() {
	}

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "()V", line = 28)
	@Override
	public void method30322() {
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "()V", line = 28)
	@Override
	public void method30319() {
	}

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "(Lclient!aap;Ljava/awt/Frame;B)V", line = 52)
	public static void method24312(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method256();
		arg1.setVisible(false);
		arg1.dispose();
	}
}
