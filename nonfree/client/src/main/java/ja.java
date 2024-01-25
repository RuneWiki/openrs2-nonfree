import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class ja extends Class17 implements Interface5 {

	@OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public ja() {
		this.la();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method6233(@OriginalArg(0) Class17 arg0) {
		this.l(this.nativeid, ((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
	private native void za(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
	private native void t(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
	private native void a(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
	private native void VA(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
	private native void P(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	@Override
	public void method6227(@OriginalArg(0) int arg0) {
		this.t(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
	private native void m(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	@Override
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.FA(this.nativeid, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
	@Override
	public void w(@OriginalArg(0) boolean arg0) {
		this.AA(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lclient!al;")
	@Override
	public Class17 method6230() {
		@Pc(3) ja local3 = new ja();
		local3.method6233(this);
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
	@Override
	public void method6242(@OriginalArg(0) int arg0) {
		this.VA(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
	private native void AA(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
	private native void FA(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.va(this.nativeid, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
	@Override
	public void method6238(@OriginalArg(0) int arg0) {
		this.NA(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
	private native void w(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static496.method6512(this);
		}
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0) {
		this.za(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
	private native void la();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.P(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.b(this.nativeid, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.XA(this.nativeid, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
	@Override
	public void method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.a(this.nativeid, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
	@Override
	public void method6239() {
		this.u(this.nativeid);
	}

	@OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
	private native void NA(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
	private native void b(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	@Override
	public void method6234(@OriginalArg(0) int arg0) {
		this.m(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
	private native void XA(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
	@Override
	public void method6226(@OriginalArg(0) int[] arg0) {
		this.w(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	@Override
	public void method6228(@OriginalArg(0) int arg0) {
		this.J(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
	private native void u(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
	private native void va(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
	private native void J(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);
}
