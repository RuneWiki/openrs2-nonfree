package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class123 implements Interface33 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	static final int anInt1264 = 34962;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	static final int anInt1269 = 34963;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
	static final int[] anIntArray132 = new int[1];

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	int anInt1267;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	int anInt1268;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	int anInt1266 = -1;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!apr;")
	final Class86_Sub1_Sub2 aClass86_Sub1_Sub2_9;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	final int anInt1265;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Z")
	final boolean aBoolean224;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!apr;IZ)V", line = 21)
	Class123(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass86_Sub1_Sub2_9 = arg0;
		this.anInt1265 = arg1;
		this.aBoolean224 = arg2;
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V", line = 28)
	void method11022() {
		if (this.anInt1266 >= 0) {
			return;
		}
		if (this.aClass86_Sub1_Sub2_9.aBoolean469) {
			OpenGL.glGenBuffersARB(1, anIntArray132, 0);
			this.anInt1266 = anIntArray132[0];
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		} else {
			this.anInt1266 = 0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()I", line = 38)
	@Override
	public int method28754() {
		return this.anInt1267;
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()I", line = 38)
	@Override
	public int method28753() {
		return this.anInt1267;
	}

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()I", line = 38)
	@Override
	public int method28747() {
		return this.anInt1267;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I", line = 38)
	@Override
	public int method28744() {
		return this.anInt1267;
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()J", line = 42)
	long method11023() {
		return this.anInt1266 == 0 ? this.aNativeHeapBuffer3.c() : 0L;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()J", line = 42)
	long method11024() {
		return this.anInt1266 == 0 ? this.aNativeHeapBuffer3.c() : 0L;
	}

	@OriginalMember(owner = "client!qa", name = "aj", descriptor = "()J", line = 42)
	long method11025() {
		return this.anInt1266 == 0 ? this.aNativeHeapBuffer3.c() : 0L;
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()V", line = 46)
	void method11026() {
		if (this.aClass86_Sub1_Sub2_9.aBoolean469) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		}
	}

	@OriginalMember(owner = "client!qa", name = "ai", descriptor = "()V", line = 46)
	void method11027() {
		if (this.aClass86_Sub1_Sub2_9.aBoolean469) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		}
	}

	@OriginalMember(owner = "client!qa", name = "al", descriptor = "()V", line = 46)
	void method11028() {
		if (this.aClass86_Sub1_Sub2_9.aBoolean469) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		}
	}

	@OriginalMember(owner = "client!qa", name = "ag", descriptor = "()V", line = 46)
	void method11029() {
		if (this.aClass86_Sub1_Sub2_9.aBoolean469) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		}
	}

	@OriginalMember(owner = "client!qa", name = "ao", descriptor = "()V", line = 46)
	void method11030() {
		if (this.aClass86_Sub1_Sub2_9.aBoolean469) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		}
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(I)V", line = 50)
	void method28728(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1268) {
			this.method11022();
			if (this.anInt1266 > 0) {
				OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
				OpenGL.glBufferDataARBub(this.anInt1265, arg0, null, 0, this.aBoolean224 ? 35040 : 35044);
				this.aClass86_Sub1_Sub2_9.anInt2810 += arg0 - this.anInt1268;
			} else {
				this.aNativeHeapBuffer3 = this.aClass86_Sub1_Sub2_9.method20453(arg0, false);
			}
			this.anInt1268 = arg0;
		}
		this.anInt1267 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 50)
	void method28730(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1268) {
			this.method11022();
			if (this.anInt1266 > 0) {
				OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
				OpenGL.glBufferDataARBub(this.anInt1265, arg0, null, 0, this.aBoolean224 ? 35040 : 35044);
				this.aClass86_Sub1_Sub2_9.anInt2810 += arg0 - this.anInt1268;
			} else {
				this.aNativeHeapBuffer3 = this.aClass86_Sub1_Sub2_9.method20453(arg0, false);
			}
			this.anInt1268 = arg0;
		}
		this.anInt1267 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "(II)J", line = 64)
	@Override
	public long method28745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		return OpenGL.glMapBufferARB(this.anInt1265, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "(II)J", line = 64)
	@Override
	public long method28749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
		return OpenGL.glMapBufferARB(this.anInt1265, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()V", line = 69)
	@Override
	public void method28746() {
		OpenGL.glUnmapBufferARB(this.anInt1265);
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V", line = 69)
	@Override
	public void method28748() {
		OpenGL.glUnmapBufferARB(this.anInt1265);
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()V", line = 69)
	@Override
	public void method28743() {
		OpenGL.glUnmapBufferARB(this.anInt1265);
	}

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method28755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11022();
		if (this.anInt1266 > 0) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
			OpenGL.glBufferSubDataARBa(this.anInt1265, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.c.copy(this.aNativeHeapBuffer3.c() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method28750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11022();
		if (this.anInt1266 > 0) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
			OpenGL.glBufferSubDataARBa(this.anInt1265, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.c.copy(this.aNativeHeapBuffer3.c() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method28751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11022();
		if (this.anInt1266 > 0) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
			OpenGL.glBufferSubDataARBa(this.anInt1265, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.c.copy(this.aNativeHeapBuffer3.c() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method28752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11022();
		if (this.anInt1266 > 0) {
			OpenGL.glBindBufferARB(this.anInt1265, this.anInt1266);
			OpenGL.glBufferSubDataARBa(this.anInt1265, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.c.copy(this.aNativeHeapBuffer3.c() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()V", line = 85)
	void method30319() {
		if (this.anInt1266 > 0) {
			this.aClass86_Sub1_Sub2_9.method20792(this.anInt1266, this.anInt1267);
			this.anInt1266 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V", line = 85)
	void method30321() {
		if (this.anInt1266 > 0) {
			this.aClass86_Sub1_Sub2_9.method20792(this.anInt1266, this.anInt1267);
			this.anInt1266 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()V", line = 85)
	void method30320() {
		if (this.anInt1266 > 0) {
			this.aClass86_Sub1_Sub2_9.method20792(this.anInt1266, this.anInt1267);
			this.anInt1266 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V", line = 85)
	void method30322() {
		if (this.anInt1266 > 0) {
			this.aClass86_Sub1_Sub2_9.method20792(this.anInt1266, this.anInt1267);
			this.anInt1266 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 92)
	@Override
	void finalize() throws Throwable {
		this.method30322();
		super.finalize();
	}

	@OriginalMember(owner = "client!qa", name = "hc", descriptor = "()V", line = 92)
	void method11037() throws Throwable {
		this.method30322();
		super.finalize();
	}

	@OriginalMember(owner = "client!qa", name = "hd", descriptor = "()V", line = 92)
	void method11038() throws Throwable {
		this.method30322();
		super.finalize();
	}

	@OriginalMember(owner = "client!qa", name = "hp", descriptor = "()V", line = 92)
	void method11039() throws Throwable {
		this.method30322();
		super.finalize();
	}
}
