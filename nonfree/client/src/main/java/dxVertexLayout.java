import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class34 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!cu;[Lclient!it;)V")
	public dxVertexLayout(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class151[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aKu1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class151 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method4660(); local23++) {
				@Pc(33) Class333 local33 = local21.method4666(local23);
				if (Static570.aClass333_1 == local33) {
					local7.addElement(local11, 2, 0, 0, 0, local17);
				} else if (local33 == Static570.aClass333_2) {
					local7.addElement(local11, 2, 0, 3, 0, local17);
				} else if (local33 == Static570.aClass333_3) {
					local7.addElement(local11, 4, 0, 10, 0, local17);
				} else if (Static570.aClass333_4 == local33) {
					local7.addElement(local11, 0, 0, 5, local9++, local17);
				} else if (Static570.aClass333_5 == local33) {
					local7.addElement(local11, 1, 0, 5, local9++, local17);
				} else if (local33 == Static570.aClass333_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local17);
				} else if (Static570.aClass333_7 == local33) {
					local7.addElement(local11, 3, 0, 5, local9++, local17);
				}
				local17 += local33.anInt9673;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
