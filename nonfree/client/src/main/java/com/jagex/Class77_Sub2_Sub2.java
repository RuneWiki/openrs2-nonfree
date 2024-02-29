package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqx")
public class Class77_Sub2_Sub2 extends Class77_Sub2 {

	@OriginalMember(owner = "client!aqx", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!aqx", name = "<init>", descriptor = "(I)V", line = 10)
	Class77_Sub2_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqx", name = "p", descriptor = "()V", line = 15)
	void method21793() {
		this.aNativeHeap6.v();
	}

	@OriginalMember(owner = "client!aqx", name = "c", descriptor = "()V", line = 15)
	void method21794() {
		this.aNativeHeap6.v();
	}
}
