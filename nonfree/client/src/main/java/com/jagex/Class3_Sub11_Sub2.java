package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alo")
public class Class3_Sub11_Sub2 extends Class3_Sub11 {

	@OriginalMember(owner = "client!alo", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!alo", name = "<init>", descriptor = "(I)V", line = 9)
	Class3_Sub11_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!alo", name = "p", descriptor = "()V", line = 14)
	void method18311() {
		this.aNativeHeap6.g();
	}
}
