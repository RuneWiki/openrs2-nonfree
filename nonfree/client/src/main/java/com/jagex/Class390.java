package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ly")
public class Class390 {

	@OriginalMember(owner = "client!ly", name = "p", descriptor = "Lclient!kp;")
	Interface36 anInterface36_24;

	@OriginalMember(owner = "client!ly", name = "c", descriptor = "I")
	int anInt4591;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ly", name = "this$0", descriptor = "Lclient!aed;")
	final Class86_Sub1 this$0;

	@OriginalMember(owner = "client!ly", name = "<init>", descriptor = "(Lclient!aed;I)V", line = 1879)
	Class390(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.this$0 = arg0;
		this.method28357();
		this.method28362(arg1, this.anInt4591);
	}

	@OriginalMember(owner = "client!ly", name = "p", descriptor = "()V", line = 1885)
	void method28357() {
		this.anInterface36_24 = this.this$0.method20656(true);
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.anInt4591 = 16;
	}

	@OriginalMember(owner = "client!ly", name = "l", descriptor = "()V", line = 1885)
	void method28358() {
		this.anInterface36_24 = this.this$0.method20656(true);
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.anInt4591 = 16;
	}

	@OriginalMember(owner = "client!ly", name = "y", descriptor = "()V", line = 1885)
	void method28359() {
		this.anInterface36_24 = this.this$0.method20656(true);
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.this$0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.anInt4591 = 16;
	}

	@OriginalMember(owner = "client!ly", name = "w", descriptor = "()V", line = 1893)
	void method28360() {
		this.anInterface36_24.method30322();
	}

	@OriginalMember(owner = "client!ly", name = "c", descriptor = "()V", line = 1893)
	void method28361() {
		this.anInterface36_24.method30322();
	}

	@OriginalMember(owner = "client!ly", name = "v", descriptor = "(II)V", line = 1897)
	void method28362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface36_24.method28760(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}

	@OriginalMember(owner = "client!ly", name = "t", descriptor = "(II)V", line = 1897)
	void method28363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface36_24.method28760(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}
}
