package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class Class35 implements Interface24 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	static final int anInt960 = 34963;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	static final int anInt964 = 34962;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
	static final int[] anIntArray104 = new int[1];

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
	int anInt959;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	int anInt961;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
	int anInt963 = -1;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!akk;")
	final Class21_Sub3_Sub1 aClass21_Sub3_Sub1_7;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	final int anInt962;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
	final boolean aBoolean190;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!akk;IZ)V", line = 21)
	Class35(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass21_Sub3_Sub1_7 = arg0;
		this.anInt962 = arg1;
		this.aBoolean190 = arg2;
	}

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "()V", line = 28)
	void method8573() {
		if (this.anInt963 >= 0) {
			return;
		}
		if (this.aClass21_Sub3_Sub1_7.aBoolean406) {
			OpenGL.glGenBuffersARB(1, anIntArray104, 0);
			this.anInt963 = anIntArray104[0];
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		} else {
			this.anInt963 = 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "()V", line = 28)
	void method8582() {
		if (this.anInt963 >= 0) {
			return;
		}
		if (this.aClass21_Sub3_Sub1_7.aBoolean406) {
			OpenGL.glGenBuffersARB(1, anIntArray104, 0);
			this.anInt963 = anIntArray104[0];
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		} else {
			this.anInt963 = 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "at", descriptor = "()V", line = 28)
	void method8583() {
		if (this.anInt963 >= 0) {
			return;
		}
		if (this.aClass21_Sub3_Sub1_7.aBoolean406) {
			OpenGL.glGenBuffersARB(1, anIntArray104, 0);
			this.anInt963 = anIntArray104[0];
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		} else {
			this.anInt963 = 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "()I", line = 38)
	@Override
	public int method25709() {
		return this.anInt961;
	}

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "()I", line = 38)
	@Override
	public int method25706() {
		return this.anInt961;
	}

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "()I", line = 38)
	@Override
	public int method25704() {
		return this.anInt961;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()I", line = 38)
	@Override
	public int method25714() {
		return this.anInt961;
	}

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "()J", line = 42)
	long method8584() {
		return this.anInt963 == 0 ? this.aNativeHeapBuffer3.a() : 0L;
	}

	@OriginalMember(owner = "client!oi", name = "af", descriptor = "()V", line = 46)
	void method8571() {
		if (this.aClass21_Sub3_Sub1_7.aBoolean406) {
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		}
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "()V", line = 46)
	void method8574() {
		if (this.aClass21_Sub3_Sub1_7.aBoolean406) {
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		}
	}

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "(I)V", line = 50)
	void method25725(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt959) {
			this.method8573();
			if (this.anInt963 > 0) {
				OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
				OpenGL.glBufferDataARBub(this.anInt962, arg0, null, 0, this.aBoolean190 ? 35040 : 35044);
				this.aClass21_Sub3_Sub1_7.anInt2483 += arg0 - this.anInt959;
			} else {
				this.aNativeHeapBuffer3 = this.aClass21_Sub3_Sub1_7.method17463(arg0, false);
			}
			this.anInt959 = arg0;
		}
		this.anInt961 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "(I)V", line = 50)
	void method25720(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt959) {
			this.method8573();
			if (this.anInt963 > 0) {
				OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
				OpenGL.glBufferDataARBub(this.anInt962, arg0, null, 0, this.aBoolean190 ? 35040 : 35044);
				this.aClass21_Sub3_Sub1_7.anInt2483 += arg0 - this.anInt959;
			} else {
				this.aNativeHeapBuffer3 = this.aClass21_Sub3_Sub1_7.method17463(arg0, false);
			}
			this.anInt959 = arg0;
		}
		this.anInt961 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "(I)V", line = 50)
	void method25723(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt959) {
			this.method8573();
			if (this.anInt963 > 0) {
				OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
				OpenGL.glBufferDataARBub(this.anInt962, arg0, null, 0, this.aBoolean190 ? 35040 : 35044);
				this.aClass21_Sub3_Sub1_7.anInt2483 += arg0 - this.anInt959;
			} else {
				this.aNativeHeapBuffer3 = this.aClass21_Sub3_Sub1_7.method17463(arg0, false);
			}
			this.anInt959 = arg0;
		}
		this.anInt961 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "(I)V", line = 50)
	void method25724(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt959) {
			this.method8573();
			if (this.anInt963 > 0) {
				OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
				OpenGL.glBufferDataARBub(this.anInt962, arg0, null, 0, this.aBoolean190 ? 35040 : 35044);
				this.aClass21_Sub3_Sub1_7.anInt2483 += arg0 - this.anInt959;
			} else {
				this.aNativeHeapBuffer3 = this.aClass21_Sub3_Sub1_7.method17463(arg0, false);
			}
			this.anInt959 = arg0;
		}
		this.anInt961 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "(II)J", line = 64)
	@Override
	public long method25710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		return OpenGL.glMapBufferARB(this.anInt962, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(II)J", line = 64)
	@Override
	public long method25713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		return OpenGL.glMapBufferARB(this.anInt962, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "(II)J", line = 64)
	@Override
	public long method25708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
		return OpenGL.glMapBufferARB(this.anInt962, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "()V", line = 69)
	@Override
	public void method25707() {
		OpenGL.glUnmapBufferARB(this.anInt962);
	}

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "()V", line = 69)
	@Override
	public void method25716() {
		OpenGL.glUnmapBufferARB(this.anInt962);
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()V", line = 69)
	@Override
	public void method25715() {
		OpenGL.glUnmapBufferARB(this.anInt962);
	}

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method25705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method8573();
		if (this.anInt963 > 0) {
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
			OpenGL.glBufferSubDataARBa(this.anInt962, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.a.copy(this.aNativeHeapBuffer3.a() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method25711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method8573();
		if (this.anInt963 > 0) {
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
			OpenGL.glBufferSubDataARBa(this.anInt962, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.a.copy(this.aNativeHeapBuffer3.a() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method25712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method8573();
		if (this.anInt963 > 0) {
			OpenGL.glBindBufferARB(this.anInt962, this.anInt963);
			OpenGL.glBufferSubDataARBa(this.anInt962, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.a.copy(this.aNativeHeapBuffer3.a() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "()V", line = 85)
	void method27208() {
		if (this.anInt963 > 0) {
			this.aClass21_Sub3_Sub1_7.method16358(this.anInt963, this.anInt961);
			this.anInt963 = -1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()V", line = 85)
	void method27210() {
		if (this.anInt963 > 0) {
			this.aClass21_Sub3_Sub1_7.method16358(this.anInt963, this.anInt961);
			this.anInt963 = -1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "()V", line = 85)
	void method27209() {
		if (this.anInt963 > 0) {
			this.aClass21_Sub3_Sub1_7.method16358(this.anInt963, this.anInt961);
			this.anInt963 = -1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "finalize", descriptor = "()V", line = 92)
	@Override
	void finalize() throws Throwable {
		this.method27209();
		super.finalize();
	}

	@OriginalMember(owner = "client!oi", name = "hh", descriptor = "()V", line = 92)
	void method8578() throws Throwable {
		this.method27209();
		super.finalize();
	}
}
