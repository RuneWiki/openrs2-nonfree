import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class201 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ta;[Lclient!wk;)V")
	public dxVertexLayout(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class388[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aBd1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class388 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method9238(); local23++) {
				@Pc(37) Class170 local37 = local21.method9233(local23);
				if (Static256.aClass170_1 == local37) {
					local7.addElement(local11, 2, 0, 0, 0, local17);
				} else if (Static256.aClass170_2 == local37) {
					local7.addElement(local11, 2, 0, 3, 0, local17);
				} else if (local37 == Static256.aClass170_3) {
					local7.addElement(local11, 4, 0, 10, 0, local17);
				} else if (local37 == Static256.aClass170_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local17);
				} else if (local37 == Static256.aClass170_5) {
					local7.addElement(local11, 1, 0, 5, local9++, local17);
				} else if (Static256.aClass170_6 == local37) {
					local7.addElement(local11, 2, 0, 5, local9++, local17);
				} else if (local37 == Static256.aClass170_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local17);
				}
				local17 += local37.anInt4519;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
