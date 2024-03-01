package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alf")
public class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!alf", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(I)V", line = 10)
	Class3_Sub11_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!alf", name = "a", descriptor = "()V", line = 15)
	void method18123() {
		this.aNativeHeap5.g();
	}

	@OriginalMember(owner = "client!alf", name = "p", descriptor = "()V", line = 15)
	void method18124() {
		this.aNativeHeap5.g();
	}

	@OriginalMember(owner = "client!alf", name = "g", descriptor = "()V", line = 15)
	void method18125() {
		this.aNativeHeap5.g();
	}
}
