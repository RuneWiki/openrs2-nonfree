import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class43 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!kfa;[Lclient!pj;)V")
	public dxVertexLayout(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class268[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aHea1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class268 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method6613(); local23++) {
				@Pc(37) Class279 local37 = local21.method6615(local23);
				if (Static458.aClass279_1 == local37) {
					local7.addElement(local11, 2, 0, 0, 0, local17);
				} else if (Static458.aClass279_2 == local37) {
					local7.addElement(local11, 2, 0, 3, 0, local17);
				} else if (Static458.aClass279_3 == local37) {
					local7.addElement(local11, 4, 0, 10, 0, local17);
				} else if (Static458.aClass279_4 == local37) {
					local7.addElement(local11, 0, 0, 5, local9++, local17);
				} else if (local37 == Static458.aClass279_5) {
					local7.addElement(local11, 1, 0, 5, local9++, local17);
				} else if (local37 == Static458.aClass279_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local17);
				} else if (local37 == Static458.aClass279_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local17);
				}
				local17 += local37.anInt7779;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
