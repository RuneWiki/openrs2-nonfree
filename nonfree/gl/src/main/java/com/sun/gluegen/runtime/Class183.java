package com.sun.gluegen.runtime;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/gluegen/runtime/BufferFactory")
public final class Class183 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "newDirectByteBuffer", descriptor = "(I)Ljava/nio/ByteBuffer;")
	public static ByteBuffer method4330(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "isDirect", descriptor = "(Ljava/nio/Buffer;)Z")
	public static boolean method4331(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return true;
		} else if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).isDirect();
		} else if (arg0 instanceof FloatBuffer) {
			return ((FloatBuffer) arg0).isDirect();
		} else if (arg0 instanceof DoubleBuffer) {
			return ((DoubleBuffer) arg0).isDirect();
		} else if (arg0 instanceof CharBuffer) {
			return ((CharBuffer) arg0).isDirect();
		} else if (arg0 instanceof ShortBuffer) {
			return ((ShortBuffer) arg0).isDirect();
		} else if (arg0 instanceof IntBuffer) {
			return ((IntBuffer) arg0).isDirect();
		} else if (arg0 instanceof LongBuffer) {
			return ((LongBuffer) arg0).isDirect();
		} else {
			throw new RuntimeException("Unexpected buffer type " + arg0.getClass().getName());
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "getDirectBufferByteOffset", descriptor = "(Ljava/nio/Buffer;)I")
	public static int method4332(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return 0;
		} else if (arg0 instanceof ByteBuffer) {
			return arg0.position();
		} else if (arg0 instanceof FloatBuffer) {
			return arg0.position() * 4;
		} else if (arg0 instanceof IntBuffer) {
			return arg0.position() * 4;
		} else if (arg0 instanceof ShortBuffer) {
			return arg0.position() * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			return arg0.position() * 8;
		} else if (arg0 instanceof LongBuffer) {
			return arg0.position() * 8;
		} else if (arg0 instanceof CharBuffer) {
			return arg0.position() * 2;
		} else {
			throw new RuntimeException("Disallowed array backing store type in buffer " + arg0.getClass().getName());
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "getArray", descriptor = "(Ljava/nio/Buffer;)Ljava/lang/Object;")
	public static Object method4333(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).array();
		} else if (arg0 instanceof FloatBuffer) {
			return ((FloatBuffer) arg0).array();
		} else if (arg0 instanceof IntBuffer) {
			return ((IntBuffer) arg0).array();
		} else if (arg0 instanceof ShortBuffer) {
			return ((ShortBuffer) arg0).array();
		} else if (arg0 instanceof DoubleBuffer) {
			return ((DoubleBuffer) arg0).array();
		} else if (arg0 instanceof LongBuffer) {
			return ((LongBuffer) arg0).array();
		} else if (arg0 instanceof CharBuffer) {
			return ((CharBuffer) arg0).array();
		} else {
			throw new RuntimeException("Disallowed array backing store type in buffer " + arg0.getClass().getName());
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "getIndirectBufferByteOffset", descriptor = "(Ljava/nio/Buffer;)I")
	public static int method4334(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = arg0.position();
		if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).arrayOffset() + local6;
		} else if (arg0 instanceof FloatBuffer) {
			return (((FloatBuffer) arg0).arrayOffset() + local6) * 4;
		} else if (arg0 instanceof IntBuffer) {
			return (((IntBuffer) arg0).arrayOffset() + local6) * 4;
		} else if (arg0 instanceof ShortBuffer) {
			return (((ShortBuffer) arg0).arrayOffset() + local6) * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			return (((DoubleBuffer) arg0).arrayOffset() + local6) * 8;
		} else if (arg0 instanceof LongBuffer) {
			return (((LongBuffer) arg0).arrayOffset() + local6) * 8;
		} else if (arg0 instanceof CharBuffer) {
			return (((CharBuffer) arg0).arrayOffset() + local6) * 2;
		} else {
			throw new RuntimeException("Unknown buffer type " + arg0.getClass().getName());
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "rangeCheck", descriptor = "([III)V")
	public static void method4335(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != null && arg0.length < arg2) {
			throw new ArrayIndexOutOfBoundsException("Required " + arg2 + " elements in array, only had " + arg0.length);
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "rangeCheck", descriptor = "(Ljava/nio/Buffer;I)V")
	public static void method4336(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null && arg0.remaining() < arg1) {
			throw new IndexOutOfBoundsException("Required " + arg1 + " remaining elements in buffer, only had " + arg0.remaining());
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/BufferFactory", name = "rangeCheckBytes", descriptor = "(Ljava/nio/Buffer;I)V")
	public static void method4337(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(5) int local5 = arg0.remaining();
		@Pc(7) int local7 = 0;
		if (arg0 instanceof ByteBuffer) {
			local7 = local5;
		} else if (arg0 instanceof FloatBuffer) {
			local7 = local5 * 4;
		} else if (arg0 instanceof IntBuffer) {
			local7 = local5 * 4;
		} else if (arg0 instanceof ShortBuffer) {
			local7 = local5 * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			local7 = local5 * 8;
		} else if (arg0 instanceof LongBuffer) {
			local7 = local5 * 8;
		} else if (arg0 instanceof CharBuffer) {
			local7 = local5 * 2;
		}
		if (local7 < arg1) {
			throw new IndexOutOfBoundsException("Required " + arg1 + " remaining bytes in buffer, only had " + local7);
		}
	}
}
