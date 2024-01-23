package com.sun.gluegen.runtime;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/gluegen/runtime/StructAccessor")
public final class Class192 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "ib", descriptor = "Ljava/nio/IntBuffer;")
	private IntBuffer anIntBuffer1;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "lb", descriptor = "Ljava/nio/LongBuffer;")
	private LongBuffer aLongBuffer1;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "sb", descriptor = "Ljava/nio/ShortBuffer;")
	private ShortBuffer aShortBuffer1;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer15;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class192(@OriginalArg(0) ByteBuffer arg0) {
		this.aByteBuffer15 = arg0.order(ByteOrder.nativeOrder());
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public ByteBuffer method4500() {
		return this.aByteBuffer15;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "getByteAt", descriptor = "(I)B")
	public byte method4501(@OriginalArg(0) int arg0) {
		return this.aByteBuffer15.get(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "setByteAt", descriptor = "(IB)V")
	public void method4502(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteBuffer15.put(arg0, arg1);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "getIntAt", descriptor = "(I)I")
	public int method4503(@OriginalArg(0) int arg0) {
		return this.method4508().get(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "setIntAt", descriptor = "(II)V")
	public void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4508().put(arg0, arg1);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "getLongAt", descriptor = "(I)J")
	public long method4505(@OriginalArg(0) int arg0) {
		return this.method4509().get(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "setLongAt", descriptor = "(IJ)V")
	public void method4506(@OriginalArg(1) long arg0) {
		this.method4509().put(1, arg0);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "setShortAt", descriptor = "(IS)V")
	public void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		this.method4510().put(arg0, arg1);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "intBuffer", descriptor = "()Ljava/nio/IntBuffer;")
	private IntBuffer method4508() {
		if (this.anIntBuffer1 == null) {
			this.anIntBuffer1 = this.aByteBuffer15.asIntBuffer();
		}
		return this.anIntBuffer1;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "longBuffer", descriptor = "()Ljava/nio/LongBuffer;")
	private LongBuffer method4509() {
		if (this.aLongBuffer1 == null) {
			this.aLongBuffer1 = this.aByteBuffer15.asLongBuffer();
		}
		return this.aLongBuffer1;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/StructAccessor", name = "shortBuffer", descriptor = "()Ljava/nio/ShortBuffer;")
	private ShortBuffer method4510() {
		if (this.aShortBuffer1 == null) {
			this.aShortBuffer1 = this.aByteBuffer15.asShortBuffer();
		}
		return this.aShortBuffer1;
	}
}
