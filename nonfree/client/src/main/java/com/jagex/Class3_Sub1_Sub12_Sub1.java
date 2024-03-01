package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aok")
public class Class3_Sub1_Sub12_Sub1 extends Class3_Sub1_Sub12 {

	@OriginalMember(owner = "client!aok", name = "b", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture1;

	@OriginalMember(owner = "client!aok", name = "c", descriptor = "I")
	final int anInt2847;

	@OriginalMember(owner = "client!aok", name = "<init>", descriptor = "(I)V", line = 9)
	Class3_Sub1_Sub12_Sub1(@OriginalArg(0) int arg0) {
		this.anInt2847 = arg0 * -1372358625;
	}

	@OriginalMember(owner = "client!aok", name = "s", descriptor = "(Ljava/util/concurrent/Future;B)V", line = 14)
	void method20932(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!aok", name = "u", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method20933(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!aok", name = "l", descriptor = "()[B", line = 18)
	@Override
	byte[] method21156() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class344) this.aFuture1.get()).method26485();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aok", name = "g", descriptor = "()[B", line = 18)
	@Override
	byte[] method21154() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class344) this.aFuture1.get()).method26485();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aok", name = "p", descriptor = "(I)[B", line = 18)
	@Override
	byte[] method21157() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class344) this.aFuture1.get()).method26485();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aok", name = "h", descriptor = "()I", line = 33)
	@Override
	int method21158() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aok", name = "a", descriptor = "(I)I", line = 33)
	@Override
	int method21155() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aok", name = "x", descriptor = "()I", line = 33)
	@Override
	int method21159() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}
}
