package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abu")
class Class45 implements Iterator {

	@OriginalMember(owner = "client!abu", name = "p", descriptor = "I")
	int anInt170;

	// $FF: synthetic field
	@OriginalMember(owner = "client!abu", name = "this$0", descriptor = "Lclient!abr;")
	final Class42 this$0;

	@OriginalMember(owner = "client!abu", name = "<init>", descriptor = "(Lclient!abr;)V", line = 63)
	Class45(@OriginalArg(0) Class42 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!abu", name = "v", descriptor = "()Z", line = 67)
	public boolean method721() {
		return this.anInt170 * -890857891 < this.this$0.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abu", name = "p", descriptor = "()Z", line = 67)
	public boolean method722() {
		return this.anInt170 * -890857891 < this.this$0.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abu", name = "c", descriptor = "()Z", line = 67)
	public boolean method723() {
		return this.anInt170 * -890857891 < this.this$0.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abu", name = "l", descriptor = "()Z", line = 67)
	public boolean method724() {
		return this.anInt170 * -890857891 < this.this$0.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abu", name = "hasNext", descriptor = "()Z", line = 67)
	@Override
	public boolean hasNext() {
		return this.anInt170 * -890857891 < this.this$0.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abu", name = "next", descriptor = "()Ljava/lang/Object;", line = 71)
	@Override
	public Object next() {
		return this.this$0.anInterface12Array3[(this.anInt170 += 448196085) * -890857891 - 1];
	}

	@OriginalMember(owner = "client!abu", name = "y", descriptor = "()Ljava/lang/Object;", line = 71)
	public Object method725() {
		return this.this$0.anInterface12Array3[(this.anInt170 += 448196085) * -890857891 - 1];
	}

	@OriginalMember(owner = "client!abu", name = "w", descriptor = "()Ljava/lang/Object;", line = 71)
	public Object method726() {
		return this.this$0.anInterface12Array3[(this.anInt170 += 448196085) * -890857891 - 1];
	}

	@OriginalMember(owner = "client!abu", name = "remove", descriptor = "()V", line = 75)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!abu", name = "t", descriptor = "()V", line = 75)
	public void method727() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!abu", name = "q", descriptor = "()V", line = 75)
	public void method728() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!abu", name = "afc", descriptor = "(Lclient!yf;I)V", line = 10388)
	static final void method729(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3403 * -1256537637;
	}
}
